package algorithms.slowsort.insertSort;

public class InsertSort {
    private final long[] arr;
    private int nElems;

    public InsertSort(int max) {
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
        int in, out;
        long temp;
        for (in = 0; in < nElems; ++in) {
            temp = arr[in];
            out = in;
            while (out > 0 && arr[out - 1] >= temp) {
                arr[out] = arr[out - 1];
                --out;
            }
            arr[out] = temp;
        }
        return arr;
    }

    public void swap(int one, int two) {
        long temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}
