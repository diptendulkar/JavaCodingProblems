package medium;
//Reverse a string without changing digit's position input = "abc12de3f" output = "fed12cb3a"
public class ReverseString {

    public static void main(String[] args) {
        String str = "abc12de3f";
        int start =0;
        int end = str.length() -1;
//        StringBuilder result = new StringBuilder();
        char[] result = new char[end+1];
        while(start < end){
            if(Character.isDigit(str.charAt(end))){
                result[end] = str.charAt(end);
                end--;
            }
            if(Character.isDigit(str.charAt(start))){
                result[start] = str.charAt(start);
                start++;
            }

            else{
                char c  = str.charAt(start);
               result[start] = str.charAt(end);
                result[end] = c;
                end--;
                start++;
            }

        }


        System.out.println(String.valueOf(result));

    }
}
