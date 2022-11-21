package classicalAlgorithm.bubbleSort;

public class BubbleSort {
    private final long[] arr;
    private int nElems;

    public BubbleSort(int max) {
        arr = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        arr[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int i = 0; i < nElems; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public boolean delete(long value) {
        int i;
        for (i = 0; i < nElems; ++i) {
            if (arr[i] == value) {
                break;
            }
        }
        if (i == nElems) {
            return false;
        } else {
            for (int j = i; j < nElems; ++j) {
                arr[j] = arr[j + 1];
            }
            --nElems;
            return true;
        }
    }

    public long[] sort() {
        boolean isChanged = true;

        while (isChanged) {
            isChanged = false;
            for (int i = 0; i < nElems - 1; ++i) {
                if (arr[i] > arr[i + 1]) {
                    swap(i, i + 1);
                    isChanged = true;
                }
            }
        }
        return arr;
    }

    public void swap(int one, int two) {
        long temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}
