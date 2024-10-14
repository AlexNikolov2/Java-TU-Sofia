public class DiagonalSum {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int diagonalSum = 0;

        for(int i = 0; i < arr.length; i++) {
            diagonalSum += arr[i][i];
        }
        for(int i = arr.length - 1; i >= 0; i--) {
            diagonalSum += arr[i][i];
        }
        System.out.printf("Сума с повторение: %d, Сума без повторение: %d%n", diagonalSum, diagonalSum - 5);
    }
}
