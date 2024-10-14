public class PrimeNumber {
    public static void main(String[] args) {
        int num = 6;
        boolean isPrime = false;

        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                isPrime = false; 
                break;
            }
            else{
                isPrime = true;
            }
        }

        System.out.println(isPrime);
    }
}
