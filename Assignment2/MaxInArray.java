import java.util.*;

public class MaxInArray {
    public static int maxNum(int arr[], int max, int i) {
        if (i == arr.length) {
            return max;
        }
        if (max < arr[i]) {
            max = arr[i];
        }
        return maxNum(arr, max, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 8, 20, 50, 40, 30 };
        int max = Integer.MIN_VALUE;
        System.out.print(maxNum(arr, max, 0));
    }
}
