package algorithms;

import java.util.Arrays;

// O(n*2)

public class bubbleSort {
    public static void main(String[] args) {
        int [] arr = new int[] {22,17,3,10,33,43,90,7,1,16,17,23,0,91,54};

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 1; j < arr.length; ++j) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
