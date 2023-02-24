package algorithms.slowsort.insertSort;

import org.junit.Assert;
import org.junit.Test;

public class InsertSortTest {

    @Test
    public void sort() {
        InsertSort insertSort = new InsertSort(6);
        insertSort.insert(22);
        insertSort.insert(2);
        insertSort.insert(4);
        insertSort.insert(32);
        insertSort.insert(44);
        insertSort.insert(55);

        long[] expected = {2, 4, 22, 32, 44, 55};
        long[] actual = insertSort.sort();
        Assert.assertArrayEquals(expected, actual);
    }
}