package javaRevision.Basic;

import java.text.NumberFormat;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//abstract class Sport {
//    public void play() { System.out.print("a");};
//}
//class InDoor extends Sport {
//    public void play() {
//        System.out.print("b");
//    }
//}
//class Badminton extends InDoor {
//    public void play() {
//        super.play();
//        System.out.print("c");
//    }
//}
//class ZeroValueException extends Exception {}
public class QuestionSolver {

//    public String attachl (List<String> data) {
//        return data.parallelStream().reduce("w", (n,m) -> n+m, String::concat);
//    }
//    public String attach2 (List<String> data) {
//        return data.parallelStream().reduce("",(p) -> 1+p).get();
//    }
//    public static void main(String[] args) {
//        QuestionSolver t =  new QuestionSolver();
//        var list = List.of("Table", "Chair");
//        String x =t.attachl (list);
//        String y= t.attach2 (list);
//        System.out.print(x+" "+y);
//    }

//    public static void main(String[] args) throws InterruptedException {
//        // Login time: 2021-01-12T21:58:18.8172
//Instant loginTime = Instant.now();
//Thread.sleep(1000);
//// Logout time: 2021-01-12T21:58:19.880Z
//Instant logoutTime = Instant.now();
//loginTime = loginTime.truncatedTo(ChronoUnit.MINUTES);// line ni
//logoutTime = logoutTime.truncatedTo (ChronoUnit.MINUTES);
//if (logoutTime.isAfter (loginTime))
//    System.out.println("Logged out at: "+ logoutTime);
//else
//    System.out.println("Can't logout");
//    }

//    public static void main(String[] args) {
//        int a = 2;
//int b = ~a;
//int c = a^b;
//boolean d=a<b & a > c++;
//        System.out.println(d + " "+ c);
//boolean e = a > b && a > c++;
//        System.out.println(e +" " + c);
//    }

//    public static void main(String[] args) {
//        float x = Math.round((1.0/3)*100)/10f/(((int)'a' == 0Xa) ? 0 : 3);
//        System.out.println(x);
//    }

//    public static void main(String[] args) {
//        int saleAmount = 10000;
//NumberFormat format1 = NumberFormat.getCurrencyInstance (Locale.US);
//NumberFormat format2 = NumberFormat.getCompactNumberInstance (Locale.US, NumberFormat.Style.SHORT);
//String res= format1.format(saleAmount);
//System.out.println(res);
//format2.format(saleAmount);
//System.out.println(saleAmount);
//    }

//    public static void main(String[] args) {
//        Sport s1 = new Badminton();
//InDoor s2 = new Badminton();
//Badminton s3 = new Badminton();
//s1.play();
//s2.play();
//s3.play();
//    }

//    public static void main(String[] args) {
//        List<Integer> l1 =List. of (1, 3, 5, 7, 9);
//List<Integer> l2 =List.of (2, 4, 6, 8);
//List<List<Integer>> l3= List.of (l1, l2);
//        List<Integer> l4 = l3.stream().flatMap(x -> x.stream()
//                .filter(y -> y > 5)).collect(Collectors.toList());
//
//
//        System.out.println(l4);
//    }


//    public static void main(String[] args) {
//        Stream.of (3, 6, 9, 12, 15, 18, 21, 24,27)
//                .takeWhile(s -> s% 3==0)
//                .dropWhile (s->s % 2 == 0)
//                .limit(3)
//                .forEach (s -> System.out.print(s + " "));
//    }

//    public static void main(String[] args) {
//        try {
//            myMethod();
//        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
//            throw new RuntimeException(e);
//        }
////line nl
//    }
//    public static void myMethod() throws NumberFormatException, ArrayIndexOutOfBoundsException{
//    int a[] = new int [2];
//    a [2] = 10;
//    }

//    public static void main(String[] args) {
//        int a[] = {0,2,4};
//try {
//        try {
//        if (a[0] == 0) throw new ZeroValueException();
//        } catch (ZeroValueException | NullPointerException zve) {
//        throw zve;
//        }
//} catch (Exception e) {
//        System.out.println("Caught " + e);
//}
//    }

//    void print(int i) {
//        System.out.println("hello");
//    }
//    void print (long j) {
//        System.out.println("there");
//    }
//
//    public static void main(String[] args) {
//        new QuestionSolver().print(0b11011010);
//    }

//    public static void main(String[] args) {
//        List<String> lst = new ArrayList<String>();
//        lst.add("e1");
//        lst.add("e3");
//        lst.add("e2");
//        int x1 = Collections.binarySearch(lst, "e3");
//        System.out.println(x1);
//        Collections.sort(lst);
//        int x2 = Collections.binarySearch(lst, "e3");
//        System.out.println(x2);
//        Collections.reverse(lst);
//        int x3 = Collections.binarySearch(lst, "e3");
//        System.out.println(x3);
//    }
//        public int x = 100;
//    public static void main(String[] args) {
//        int x = 1000;
//        QuestionSolver t = new QuestionSolver();
//        t.myMethod(x);
//        System.out.println(x);
//    }
//    public void myMethod(int x) {
//        x++;
//        System.out.println(x);
//        System.out.println(this.x);
//    }
}
