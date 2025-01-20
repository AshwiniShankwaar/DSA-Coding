package javaRevision.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntremediateOps {
    public static void main(String[] args) {
        List<String> names = Stream.of("Ashwini","Puja","Nitu","Ankita").map(String::toUpperCase).toList();
//        Stream<String> st = names.stream().filter(s->s.startsWith("A")).filter(s->s.toLowerCase().endsWith("a"));
//        List<String> l = st.collect(Collectors.toList());
//        long count = st.count(); //once the termination ops is performed then if we try to perform any action
//        on stream then we will get exception
//        System.out.println("count: " + count);
//        l.forEach(System.out::println);

//        Stream<String> st = names.stream().sorted();
//        st.forEach(System.out::println);
        Stream<String> st2 = names.stream().sorted((a,b)->a.length()-b.length());
        st2.forEach(System.out::println);

    }
}
