package easy;

public class DataTypeParser {
    public static void main(String[] args) {
        String str = "this is 29 and 2.0";
        // output - count
        // string 3
        //intger 1
        // double 1
        parseString(str);

    }

    public static void parseString(String sentance){

        int doubleCounter =0, strCounter=0, intCounter=0;
        String[] input = sentance.split(" ");
        for(String str : input){
            if(str.contains("."))
                doubleCounter++;
            else if (str.matches("[0-9]"))
                intCounter++;
            else
               strCounter++;
        }
        System.out.println("string " + strCounter);
        System.out.println("integer " + intCounter);
        System.out.println("double " + doubleCounter);


    }
}
