package coreJava;

public class CustomHash {
    public static void main(String[] args) {
        System.out.println("abc".hashCode());
        System.out.println(getHash("abc"));
        System.out.println(getHash("bac"));
        System.out.println(0xff);
    }

    public static int getHash(String str){

        int result =str.length();
        for( Character c : str.toCharArray()){
            result = 2*  result + c;

        }
        return result;
    }
}
