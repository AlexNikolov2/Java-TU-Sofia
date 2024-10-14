public class MinMaxValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

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

        System.out.printf("Макс: %d, Мин: %d%n", max, min);
    }
}
