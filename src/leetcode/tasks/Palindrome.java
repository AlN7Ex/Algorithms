package leetcode.tasks;

public class Palindrome {

    public boolean isPalindrome(int x) {
        int temp = x;
        int reversed = 0;

        while (temp > 0) {
            int lastDigit = temp % 10;
            reversed = reversed * 10 + lastDigit;
            temp = temp / 10;
        }
        return reversed == x;
    }
}
