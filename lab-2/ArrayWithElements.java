public class ArrayWithElements{
    public static void main(String[] args) {
        int[] results = findSums();

        System.out.println("Сума: " + results[0]);
        System.out.println("Четни: " + results[1]);
        System.out.println("Нечетни: " + results[2]);
    }

    public static int[] findSums(){
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

        return new int[]{sum, evenSum, oddSum};
    }
}