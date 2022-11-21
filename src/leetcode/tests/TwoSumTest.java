package leetcode.tests;

import leetcode.tasks.TwoSum;
import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void twoSum1() {
        int[] expected = {0, 1};
        Assert.assertArrayEquals(expected, new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    public void twoSum2() {
        int[] expected = {1, 2};
        Assert.assertArrayEquals(expected, new TwoSum().twoSum(new int[]{3, 2, 4}, 6));
    }

    @Test
    public void twoSum3() {
        int[] expected = {0, 1};
        Assert.assertArrayEquals(expected, new TwoSum().twoSum(new int[]{3, 3}, 6));
    }
}