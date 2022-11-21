package leetcode.tasks;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int min = Integer.MAX_VALUE;
        for (String str : strs) {
            min = Math.min(min, str.length());
        }
        for (int i = 0; i < min; ++i) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; ++j) {
                if (ch != strs[j].charAt(i))
                    return sb.toString();
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
