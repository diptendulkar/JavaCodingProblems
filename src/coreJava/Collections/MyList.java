package coreJava.Collections;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        final  List<String> finalList = new ArrayList<>();
        list.add("Dip");
        finalList.add("AAA");

        System.out.println(list.get(0));
        System.out.println(finalList.get(0));

        finalList.set(0,"BBB");
        System.out.println(finalList.get(0));

        list = new ArrayList<>(10);
      //  finalList = new ArrayList<>(20); // Cannot asign a value to final variable

     //  finalList = list; /// cannot asign another list to final List


    }
}
