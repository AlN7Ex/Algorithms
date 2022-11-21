package leetcode.tests;

import leetcode.tasks.LongestCommonPrefix;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class LongestCommonPrefixTest {

    private String[] actual1;
    private String[] actual2;
    private String[] actual3;

    @Before
    public void init1() {
        actual1 = new String[]{"flower", "flow", "flight"};
        actual2 = new String[]{"dog", "racecar", "car"};
        actual3 = new String[]{"airforce", "airf*ck", "airfair"};
    }

    @Test
    public void longestCommonPrefix1() {
        String expected = "fl";
        Assert.assertEquals(expected, new LongestCommonPrefix().longestCommonPrefix(actual1));
    }

    @Test
    public void longestCommonPrefix2() {
        String expected = "";
        Assert.assertEquals(expected, new LongestCommonPrefix().longestCommonPrefix(actual2));
    }

    @Test
    public void longestCommonPrefix3() {
        String expected = "airf";
        Assert.assertEquals(expected, new LongestCommonPrefix().longestCommonPrefix(actual3));
    }
}