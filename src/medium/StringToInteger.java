package medium;

public class StringToInteger {
    public static void main(String[] args) {
        String s = "-91283472332";
        System.out.println(myAtoi(s));

    }

    public static int myAtoi(String s) {

        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }
        int count = 0;
        int sign = 1; // Default to positive sign

        int i = 0;
        if (s.charAt(0) == '-') {
            sign = -1;
            i = 1;
        } else if (s.charAt(0) == '+') {
            i = 1;
        }

        for (; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                break;
            }
            int n = s.charAt(i) - '0';

            // Check for overflow/underflow before updating count
            if (count > (Integer.MAX_VALUE - n) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            count = count * 10 + n;
        }

        count = count * sign;

        return count;

    }
}
