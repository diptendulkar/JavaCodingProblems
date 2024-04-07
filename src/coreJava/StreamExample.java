package coreJava;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        //*****   MAP -> One-to-One Transformation: double the number  *****//
        Stream<Integer> myStream = Stream.of(1,5,2,7,4);
        myStream = myStream.map(a -> a*2);
       // myStream.forEach(System.out::println);

        //*****  FlatMap -> One-to-Many Transformation -> change to char array *****//
        Stream<String> words = Stream.of("hello", "world");
        //conver to char list
        List<Character> characters = words.flatMap(w ->  w.chars().mapToObj(c -> (char) c)).collect(Collectors.toList());
       //sort by char
        characters =characters.stream().sorted((e1,e2) -> {
            return String.CASE_INSENSITIVE_ORDER.compare(e1.toString(), e2.toString());
        }).collect(Collectors.toList());

        //***** remove duplicate char using distinct method *****//
        characters =   characters.stream().distinct().collect(Collectors.toList());
      //  characters.forEach(System.out::println); // This will print each character on a new line


        //***** JOIN TWO List using Stream *****//

        List<String> list1 = Stream.of("Dip", "Das").collect(Collectors.toList());
        List<String> list2 = Stream.of("Diptendu", "Das").collect(Collectors.toList());

        List<String> mergeList = Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList());
      //  mergeList.stream().forEach(System.out::println);

        // *****  Find Duplicates from String of Array  *****//

        String[] array = {"Dip","Das", "Dip","abc", "xyz", "abc"};
        List<String> duplicates = new ArrayList<>();

        duplicates = Arrays.stream(array)
                .collect(Collectors.groupingBy(s->s))
                .entrySet().stream()
                .filter(e->e.getValue().size() >1)
                .map(e-> e.getKey())
                .collect(Collectors.toList());

      //  duplicates.stream().forEach(System.out::println);


        // **** SORT A HASHMAP ****//

        Map<Integer,String> map = new HashMap<>();
        map.put(3,"cccc");
        map.put(2,"bbbbb");
        map.put(4,"dddd");
        map.put(5,"aaaa");

        map.entrySet().stream().sorted((e1,e2) -> String.CASE_INSENSITIVE_ORDER.compare( e1.getValue() , e2.getValue() )).forEach(System.out::println);
    }

}
