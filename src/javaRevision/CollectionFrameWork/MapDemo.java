package javaRevision.CollectionFrameWork;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
//        HashMap<Integer,String> table = new HashMap<Integer,String>();
//        Hashtable<Integer,String> table = new Hashtable<Integer,String>();
        SortedMap<Integer,String> table = new TreeMap<Integer,String>(Collections.reverseOrder());

        table.put(1,"Ashwini");
        table.put(2,"puja");
        table.put(3,"nitu");
        table.put(4,"ankita");

        for(Map.Entry<Integer,String> emp:table.entrySet()){
            System.out.println(emp.getValue());
        }
        System.out.println(table.comparator());
    }
}
