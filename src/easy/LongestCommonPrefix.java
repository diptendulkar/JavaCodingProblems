package easy;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));

        String[] strs2 = {""};
        System.out.println(longestCommonPrefix(strs2));

        String[] strs3 = {"a"};
        System.out.println(longestCommonPrefix(strs3));

    }

    public static String longestCommonPrefix(String[] strs) {


        StringBuilder result = new StringBuilder();
        int len = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            len = Math.min(len, strs[i].length());
        }

        if (len < 1)
            return "";
        int j = 0;

        while (j < len) {

            char ch = strs[0].charAt(j);
            for (int i = 0; i < strs.length; i++) {
                if (ch != strs[i].charAt(j)) {
                    return result.toString();
                }

            }
            result.append(ch);
            j++;
        }


        return result.toString();
    }
}
