package leetcode.tests;

import leetcode.tasks.Palindrome;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {

    @Test
    public void isPalindrome1() {
        boolean expected = true;
        Assert.assertEquals(expected, new Palindrome().isPalindrome(121));
    }

    @Test
    public void isPalindrome2() {
        boolean expected = false;
        Assert.assertEquals(expected, new Palindrome().isPalindrome(-121));
    }

    @Test
    public void isPalindrome3() {
        boolean expected = false;
        Assert.assertEquals(expected, new Palindrome().isPalindrome(10));
    }
}