package classicalAlgorithm.bubbleSort;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void sort() {
        BubbleSort bubbleSort = new BubbleSort(6);
        bubbleSort.insert(22);
        bubbleSort.insert(2);
        bubbleSort.insert(4);
        bubbleSort.insert(32);
        bubbleSort.insert(44);
        bubbleSort.insert(55);

        long[] expected = {2, 4, 22, 32, 44, 55};
        long[] actual = bubbleSort.sort();
        Assert.assertArrayEquals(expected, actual);
    }
}