
import java.util.Scanner;

public class SimpleCar {
    public static void main(String[] args){
        Scanner initialScanner = new Scanner(System.in);

        int initialSpeed = initialScanner.nextInt();

        int initialAcceleration = 10;

        for (int i = 0; i < 3; i++) {
            initialSpeed = accelerate(initialSpeed, initialAcceleration);
            System.out.printf("Speed after accelerate: %d%n", initialSpeed);
        }
    }
    public static int accelerate(int speed, int acceleration){
        return speed + acceleration;
    }

}
