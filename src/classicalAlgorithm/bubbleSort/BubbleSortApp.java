package classicalAlgorithm.bubbleSort;

public class BubbleSortApp {
    public static void main(String[] args) {
//        BubbleSort bubbleSort = new BubbleSort(100);
//        bubbleSort.insert(33);
//        bubbleSort.insert(2);
//        bubbleSort.insert(22);
//        bubbleSort.insert(32);
//        bubbleSort.insert(44);
//        bubbleSort.insert(4);
//        bubbleSort.insert(10);
//        bubbleSort.insert(50);
//
//
//        bubbleSort.display();
//        bubbleSort.sort();
//        bubbleSort.display();
//        bubbleSort.delete(10);
//        bubbleSort.display();

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
