package javaRevision.Stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParrallelStream {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        List<Long> factorialList = list.stream().map(ParrallelStream::factorial).toList();
        factorialList.forEach(System.out::println);
        long end = System.currentTimeMillis();
        System.out.println("stream: "+(end-start));

        long startp = System.currentTimeMillis();
        List<Integer> listp = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        List<Long> factorialListp = listp.parallelStream().map(ParrallelStream::factorial).toList();
        factorialListp.forEach(System.out::println);
        long endp = System.currentTimeMillis();
        System.out.println("parallelStream: "+(endp-startp));
        Map<Boolean,List<Integer>> partitionBy = listp.stream().collect(Collectors.partitioningBy(i->i%2==0));
        System.out.println(partitionBy);


        List<String> names = List.of("Ashwini","Ankita","Puja","Nitu","Niharika","Unatti");
        Map<Character,List<String>> groupBy = names.stream().collect(Collectors.groupingBy(i->i.charAt(0)));
        System.out.println(groupBy);

        System.out.println("Sequential Stream:");
        IntStream.range(1, 10).forEach(System.out::println);

        System.out.println("Parallel Stream:");
        IntStream.range(1, 10).parallel().forEach(System.out::println);

    }
    private static long factorial(int i){
        long n = 1;
        for (int j = 2; j <= i; j++) {
            n*=j;
        }
        return n;
    }
}
