public class ArrayWithElements{
    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1; 
        }

        int sum = 0;
        int evenSum = 0;
        int oddSum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                evenSum += arr[i];
            }
        
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                oddSum += arr[i];
            }
        }
        System.out.printf("Сума: %d, Четни: %d, Нечетни: %d%n", sum, evenSum, oddSum);
    }
}