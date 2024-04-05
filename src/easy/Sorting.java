package easy;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {
        hashMapSorting();
    }

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
                .sorted(
                        (s1, s2) -> String.CASE_INSENSITIVE_ORDER.compare(s1.getValue(), s2.getValue()))
                .forEach(System.out::println);

    }
}
