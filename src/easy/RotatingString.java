package easy;

public class RotatingString {

    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "cdab";  // output true
        System.out.println("Is this Rotating string: " + checkRotatingString(str1,str2));
    }

    public static boolean checkRotatingString(String str1, String str2){

        return ((str1.length() == str2.length()) &&  ((str1 + str1).indexOf(str2)>0));

    }
}
