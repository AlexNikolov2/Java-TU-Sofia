import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        int newArray[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            newArray[arr.length - 1 - i] = arr[i];
        }

        System.out.println(Arrays.toString(newArray));
    }

}
