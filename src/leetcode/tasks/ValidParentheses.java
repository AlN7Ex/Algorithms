/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 */

package leetcode.tasks;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.isEmpty()) {
            return false;
        }

        Stack<Character> parentheses = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch){
                case '(':
                case '[':
                case '{':
                    parentheses.push(ch);
                    break;
                case ')':
                    if (parentheses.isEmpty() || parentheses.peek() != '(') {
                        return false;
                    }
                    else {
                        parentheses.pop();
                    }
                    break;
                case ']':
                    if (parentheses.isEmpty() || parentheses.peek() != '[') {
                        return false;
                    }
                    else {
                        parentheses.pop();
                    }
                    break;
                case '}':
                    if (parentheses.isEmpty() || parentheses.peek() != '{') {
                        return false;
                    }
                    else {
                        parentheses.pop();
                    }
                    break;
                default:
                    return false;
            }
        }
        return parentheses.isEmpty();
    }
}
