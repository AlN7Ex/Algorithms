package leetcode.tests;

import leetcode.tasks.RomanToInteger;
import org.junit.Assert;
import org.junit.Test;

public class RomanToIntegerTest {

    @Test
    public void romanToInt1() {
        int expected = 3;
        Assert.assertEquals(expected, new RomanToInteger().romanToInt("III"));
    }

    @Test
    public void romanToInt2() {
        int expected = 58;
        Assert.assertEquals(expected, new RomanToInteger().romanToInt("LVIII"));
    }
}