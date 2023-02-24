package algorithms.slowsort.selectSort;


public class SelectSortApp {

    public static void main(String[] args) {
        SelectSort selectSort = new SelectSort(100);

        selectSort.insert(33);
        selectSort.insert(2);
        selectSort.insert(22);
        selectSort.insert(32);
        selectSort.insert(44);
        selectSort.insert(4);
        selectSort.insert(10);
        selectSort.insert(50);

        selectSort.display();
        selectSort.sort();
        selectSort.display();
        selectSort.delete(10);
        selectSort.display();

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
