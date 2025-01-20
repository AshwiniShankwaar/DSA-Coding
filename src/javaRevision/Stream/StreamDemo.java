package javaRevision.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        //stream will have source,intermediate operation and terminate operation
        //intermediate operation will return stream

        List<Integer> arr = List.of(1,24,16,78,23,14,12,46,34,89,90,28,19);
        //       arr.forEach(System.out::println);
//        System.out.println("power of 2");
//        List<Integer> list = arr.stream().map(x -> x * x).toList();//map take function
//        list.forEach(System.out::println);
//        System.out.println("even numbers");
//        List<Integer> list2 = list.stream().filter(x->x%2==0).toList();
//        list2.forEach(System.out::println);

        Stream<String> stream = Stream.of("a","b");
        Stream<Integer> infinite = Stream.generate(()->1).limit(100); //generate 100 i
        List<Integer> count = Stream.iterate(1,i->i+1).limit(100).toList(); //generate 1 to 100

    }
}
