package arrays;

import java.util.Arrays;

public class Max_no {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 56, 42};
        System.out.println(findMax(arr));
    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
    return max;
    }
}
