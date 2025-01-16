package javaRevision.generic;

public class GenericMethodDemo {
    public static <T> void printSome(T[] data){
        for(Object d : data){
            System.out.print(d+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] num = {1,2,3,4};
        String[] s = {"a","b","c","d","e","f"};

        printSome(num);
        printSome(s);
    }
}
