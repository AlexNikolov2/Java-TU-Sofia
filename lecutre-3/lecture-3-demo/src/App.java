
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner randomIntScanner = new Scanner(System.in);
        int randomInt = randomIntScanner.nextInt();

        try{
            System.out.println(divide(randomInt, 0));
        }
        catch(ArithmeticException err){
            System.out.println("An Arithmetic Exception");
        }
        catch(DivisionByZeroError err){
            System.out.println("Division by Zero Forbidden!");
        }
        finally{
            System.out.println("Finally!");
        }

    }

    public static int divide(int a, int divider) throws Error{
        if(divider == 0) 
        {
            throw new DivisionByZeroError();
        }    
        int result = a / divider;
        return result;
    }
}
