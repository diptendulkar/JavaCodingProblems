package coreJava.dataStructure;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();

        treeMap.put(2,"Diptendu");
        treeMap.put(7,"Rahul");
        treeMap.put(3,"Aditya");
        treeMap.put(1,"Manoj");
        treeMap.put(4,"Suraj");

        // Printing the TreeMap (Keys will be in sorted order)
        System.out.println("TreeMap: " + treeMap);

        // Accessing values
        System.out.println("Value for key 3: " + treeMap.get(3));

        // Removing a key-value pair
        treeMap.remove(2);
        System.out.println("TreeMap: " + treeMap);

    }
}
