package easy;

import java.util.*;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {
        hashMapSorting();
        employeeSalarySorting();
    }

    //WAP to sort a HasMap considering time complexity
    public static void hashMapSorting() {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "AA");
        map.put(2, "BB");
        map.put(5, "EE");
        map.put(4, "DD");
        map.put(3, "CC");

//        The sorting operation typically has a time complexity of O(n log n),
//        where n is the number of elements in the stream (the number of key-value pairs in the HashMap).
//        This is because sorting algorithms like Merge Sort or Timsort,
//        which are commonly used in Java Streams, have this complexity.

        map.entrySet().stream()
                .sorted((s1, s2) -> String.CASE_INSENSITIVE_ORDER.compare(s1.getValue(), s2.getValue()))
                .forEach(System.out::println);

    }

    //Write a program to sorting a HashMap based salary  on  Employee object having name and salary, without  using stream

    public static void employeeSalarySorting(){

        HashMap<Integer, Employee> map = new HashMap<>();
        map.put(1, new Employee("Alice", 80000));
        map.put(2, new Employee("Bob", 75000));
        map.put(3, new Employee("Charlie", 90000));
        map.put(4, new Employee("David", 65000));

        //create a list to hold sorted list
        ArrayList<Map.Entry<Integer,Employee>> sortedList = new ArrayList<>(map.entrySet());

        // Comparator for sorting based on salary (ascending order)
        Comparator<Map.Entry<Integer, Employee>> salaryComparator = (e1, e2) -> Double.compare(e1.getValue().getSalary(), e2.getValue().getSalary());

        // Sort the list using Collections.sort
        Collections.sort(sortedList,salaryComparator);
        // Print the sorted entries
        System.out.println("Sorted by Salary (Ascending):");
        for (Map.Entry<Integer, Employee> entry : sortedList) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue().getName() + ", Salary: $" + entry.getValue().getSalary());
        }



    }

    static class Employee {
        private String name;
        private double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }
    }
}
