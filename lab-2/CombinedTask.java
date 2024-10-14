import java.util.Arrays;

public class CombinedTask {
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

        int newArray[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            newArray[arr.length - 1 - i] = arr[i];
        }

        int min = 1;
        int max = 1;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] <= min){
                min = arr[i];
            }
            if(arr[i] >= max){
                max = arr[i];
            }
        }
        System.out.printf("Сума: %d, Четни: %d, Нечетни: %d, Обърнат: %s, Макс: %d, Мин: %d%n", sum, evenSum, oddSum, Arrays.toString(newArray), max, min);
    }    
}
