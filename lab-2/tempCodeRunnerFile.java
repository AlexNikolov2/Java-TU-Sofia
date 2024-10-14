public class DiagonalsSum {
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
        diagonalSum -= 5;


        System.out.println(diagonalSum);
    }
}