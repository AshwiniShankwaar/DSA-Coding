package javaRevision.CollectionFrameWork;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CallectionDemo {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.offer(10);
        System.out.println(queue.poll());
        queue.forEach(System.out::println);

//        ArrayList<Emp> l = new ArrayList<Emp>();
//        l.add(new Emp("Ashwini","xyz"));
//        l.add(new Emp("puja","xyz"));
//        l.add(new Emp("nitu","xyz"));
//        l.add(new Emp("ankita","xy"));
//
//        System.out.println(l);
////        Collections.sort(l,new MyComparetor());
//        Collections.sort(l);
//        System.out.println(l);


        //set
//        Set<Integer> set = new LinkedHashSet<Integer>();
//        TreeSet<Integer> set = new TreeSet<Integer>(){
//
//        };
//        int min = 1;
//        int max = 100;
//        for(int i = 0;i<20;i++){
//           set.add((int) (Math.random()*(max-min-1))+min);
//        }
//        set.add(100);
//        set.add(null);
//        Iterator<Integer> i = set.iterator();
//        while(i.hasNext()){
////            if(i.next() != null) {
////                int x = i.next();
//                System.out.println(i.next());
////            }
//        }

//        List<Integer> sortedList = set.stream()
//                .filter(x -> x % 2 != 0)          // Filter odd numbers
//                .map(x -> x * 100)                // Multiply by 100
//                .sorted((a, b) -> {               // Sort in descending order
//                    int x = a.compareTo(b);
//                    if (x < 0) return 1;
//                    else return -1;
//                })
//                .collect(Collectors.toList());    // Collect into a List
//
//        System.out.println(sortedList);
//        set.subSet(40,90).stream().forEach(System.out::println);


//        Vector<Integer> v = new Vector<Integer>();
//        Stack<Integer> v = new Stack<Integer>();
//        System.out.println(v.capacity());
//        v.add(1);
//        v.add(2);
//        v.add(3);
//        v.add(4);
//        int min = 1;
//        int max = 100;
//        for(int i = 0;i<20;i++){
////            v.addElement((int) (Math.random()*(max-min-1))+min);
//            v.push((int) (Math.random()*(max-min-1))+min);
//        }

//        Enumeration<Integer> e = v.elements();
//        while (e.hasMoreElements()){
//            System.out.println(e.nextElement());
//        }

//        ArrayList<Integer> a = new ArrayList<>(v);
//        Iterator<Integer> i = a.iterator();
//        while (i.hasNext()){
//            int data = i.next();
//            System.out.println(data);
//        }
//        List list = Collections.synchronizedList(a);
//        ListIterator<Integer> l = a.listIterator();
//        while (l.hasNext()){
//            int data = l.next();
//
//            System.out.println(data);
//        }
    }
}
