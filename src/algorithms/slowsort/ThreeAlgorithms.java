package algorithms.slowsort;

import java.util.Arrays;

public class ThreeAlgorithms {
    public static void main(String[] args) {

        System.out.println("-----Bubble sorting-----");
        BubbleSortAlg(new int[]{63, 5, 11, 2, 7});
        System.out.println("-----Select sorting-----");
        SelectSortAlg(new int[]{63, 5, 11, 2, 7});
        System.out.println("-----Insertion sorting-----");
        InsertSortAlg(new int[]{63, 5, 11, 2, 7});
    }

    static void BubbleSortAlg(int[] arr) {
        boolean isSorted = true;
        while (isSorted) {
            isSorted = false;
            for (int i = 1; i < arr.length; ++i) {
                if (arr[i] < arr[i - 1]) {
                    arr[i] = arr[i] + arr[i - 1];
                    arr[i - 1] = arr[i] - arr[i - 1];
                    arr[i] = arr[i] - arr[i - 1];
                    isSorted = true;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void SelectSortAlg(int[] arr) {

        int minIndex;
        for (int i = 0; i < arr.length; ++i) {
            minIndex = i;

            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                arr[i] = arr[i] + arr[minIndex];
                arr[minIndex] = arr[i] - arr[minIndex];
                arr[i] = arr[i] - arr[minIndex];

            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void InsertSortAlg(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;

            while ((j >= 0) && (arr[j] > key)) {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = key;
        }

        System.out.println(Arrays.toString(arr));
    }
}
