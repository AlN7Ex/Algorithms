package leetcode.tests;

import leetcode.tasks.ValidParentheses;
import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {

    @Test
    public void isValid1() {
        String input = "()";
        Assert.assertTrue(new ValidParentheses().isValid(input));
    }
    @Test
    public void isValid2() {
        String input = "([{}])";
        Assert.assertTrue(new ValidParentheses().isValid(input));
    }
    @Test
    public void isValid3() {
        String input = "{)[]";
        Assert.assertFalse(new ValidParentheses().isValid(input));
    }

    @Test
    public void isValid4() {
        String input = "}()";
        Assert.assertFalse(new ValidParentheses().isValid(input));
    }

    @Test
    public void isValid5() {
        String input = "";
        Assert.assertFalse(new ValidParentheses().isValid(input));
    }

    @Test
    public void isValid6() {
        String input = " ";
        Assert.assertFalse(new ValidParentheses().isValid(input));
    }

    @Test
    public void isValid7() {
        String input = "[";
        Assert.assertFalse(new ValidParentheses().isValid(input));
    }
    @Test
    public void isValid8() {
        String input = "((";
        Assert.assertFalse(new ValidParentheses().isValid(input));
    }
}