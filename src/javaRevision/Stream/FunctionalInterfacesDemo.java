package javaRevision.Stream;

import java.util.function.*;

public class FunctionalInterfacesDemo {
    public static void main(String[] args) {

        // we are treating a function as a variable this is functional programming
//        Demo demo = (s)->s.length()==0?true:false;
//        //lambda function
//        Thread t = new Thread(()->{
//            String[] list = {"Ashwini","Shankwaar","","Puja","Nitu","Ankita"};
////            for (String s:list) System.out.println(s);
//            Arrays.stream(list).forEach(s->{
//                if(!demo.checkStringEmpty(s)){
//                    int i = Demo.getLength(s);
//                    if(demo.isEven(i)){
//                        System.out.println(s);
//                    }
//                }
//
//            });
//
//        });
//        t.start();

//        Predicate<Integer> isEven = (i)->i%2==0; //Predicate is a functional interface having one abstract method
//        // test boolean function that will return boolean value
//        System.out.println(isEven.test(11));
//        System.out.println(isEven.and((i)->isEven.test(i*2)).test(11));
//        Function<Integer, Integer> doubleIt = (i)->i*2;//Function is  a functional interface having apply as a
//        // abstract function and it returns a value of type Integer as it is provided in Function<Integer, Integer>
//        // where first is type of argument and other is return type of
//        System.out.println(doubleIt.apply(20));
//        System.out.println(doubleIt.andThen((i)->i*3).apply(20));
//
//        Consumer<Integer> c = (i)-> System.out.println(i*2);
//        c.accept(10);
//
//        Supplier<Integer> s = ()-> (int) Math.ceil(Math.random());
//        System.out.println(s.get());

        //simmiler to this there is BiPredicate, BiConsumer and BiFunction it take two arguments

//        BiPredicate<Integer,Integer> chcekEquals = (a,b)->a.equals(b);
//        System.out.println(chcekEquals.test(10,20));
//
//        BiConsumer<Integer,Integer> biConsumer = (a,b)-> System.out.println(a+b);
//        biConsumer.accept(10,30);
//
//        BiFunction<Integer,Integer,String> biFunction = (a,b)-> STR."\{a * b}";
//        System.out.println(biFunction.apply(10,30));

        // sometimes there will be same argument type as well as return type then use unary function

        UnaryOperator<Integer> u = (i)->i*i;
        System.out.println(u.apply(25));

        BinaryOperator<Integer> b = (a,c)-> (int) Math.pow(a,c);
        System.out.println(b.apply(25,5));
    }


}
//functional interface are those interface that has only one abstract method
//but can have multiple static as well default interface
//Ex

//@FunctionalInterface
//interface Demo{
//    abstract boolean checkStringEmpty(String s);
//    static int getLength(String s){
//        return s.length();
//    }
//    default boolean isEven(int i){
//        return i % 2 == 0;
//    }
//}
