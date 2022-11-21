package classicalAlgorithm.selectSort;

import org.junit.Assert;
import org.junit.Test;

public class SelectSortTest {

    @Test
    public void sort() {
        SelectSort selectSort = new SelectSort(6);
        selectSort.insert(22);
        selectSort.insert(2);
        selectSort.insert(4);
        selectSort.insert(32);
        selectSort.insert(44);
        selectSort.insert(55);

        long[] expected = {2, 4, 22, 32, 44, 55};
        long[] actual = selectSort.sort();
        Assert.assertArrayEquals(expected, actual);
    }
}