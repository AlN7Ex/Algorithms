package algorithms.slowsort.insertSort;

public class InsertSortApp {
    public static void main(String[] args) {
        InsertSort insertSort = new InsertSort(10);

        insertSort.insert(33);
        insertSort.insert(2);
        insertSort.insert(22);
        insertSort.insert(32);
        insertSort.insert(44);
        insertSort.insert(4);
        insertSort.insert(10);
        insertSort.insert(50);

        insertSort.display();
        insertSort.sort();
        insertSort.display();
        insertSort.delete(10);
        insertSort.display();

        int[] arr;
        arr = new int[]{3, 2, 0, 0, 5, 6, 0};
        System.out.print("Arr: ");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Length: " + arr.length);
        int len = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] != 0) {
                ++len;
            }
        }
        int[] arr2 = new int[len];
        int j = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] != 0) {
                arr2[j++] = arr[i];
            }
        }

        System.out.print("Arr 2: ");
        for (int i = 0; i < arr2.length; ++i) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        System.out.println("Length: " + arr2.length);
    }
}
