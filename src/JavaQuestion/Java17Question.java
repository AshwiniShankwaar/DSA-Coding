package JavaQuestion;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java17Question {
}
//Q1
//    class Q1 {
//        public static void main(String[] args) {
//            List<String> elements = Arrays.asList(
//                    "car", "truck", "car",
//                    "bicycle", "car", "truck", "motorcycle"
//            );
//            Map<String, Long> outcome = elements.stream()
//                    .collect(Collectors.groupingBy(
//                            Function.identity(),
//                            Collectors.counting()
//                    ));
//            System.out.println(outcome);
//        }
//    }

//{bicycle=1, car=3, motorcycle=1, truck=2}

//Q2
//    class Q2{
//        public static void main(String[] args) {
//            Stream<String> s1 = Stream.of("A", "B", "C", "B");
//            Stream<String> s2 = Stream.of("A", "D", "E");
//
//            Stream.concat(s1, s2)
//                    .parallel()
//                    .distinct()
//                    .forEach(element -> System.out.print(element));
//        }
//    }

//Q3
//        public class VarType {
//            public static void main(String[] args) {
//                var n = 9;
//                var s = findSq (n);// line nl
//                System.out.print(s);
//                n = 8;// line n2
//                s = findSq(n);
//                System.out.print(" "+s);
//            }
//            public static int findSq (var x) {// line n3
//                var x1 = 10;// line n4
//                return x1 * x;
//            }
//
//        }
//With which action does 90 80 get printed?
//options
//Replace line n4 with int x1 = 10;
//Comment line n2 and replace s = findSq(n); with s = findSq(8);
// Replace line nl with int s = findSq(n);
//At line n3, replace var x with int x

//Q4
//public class App {
//    public int x = 100;
//    public static void main(String[] args) {
//        int x = 1000;
//        App t = new App();
//        t.myMethod(x);
//        System.out.println(x);
//    }
//    public void myMethod(int x) {
//        x++;
//        System.out.println(x);
//        System.out.println(this.x);
//    }
//} //What is result

//public class Q5{
//    public static void main(String[] args) {
//        List<String> lst = new ArrayList<String>();
//        lst.add("el");
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
//
//        //What is the result?
//    }
//}

//public class Q6{
//    public static void main(String[] args) {
//        List<String> lst = new ArrayList<String>();
//        lst.add("el");
//        lst.add("e2");
//        lst.add("e3");
//        Deque<String> dql = new ArrayDeque<>(lst);
//        System.out.println(dql.offer("e4"));
//        System.out.println(dql.pollFirst());
//        System.out.println(dql.peekFirst());
//        System.out.println(dql.pop());
//        System.out.println(dql);
//        //What is the result?
//    }
//}


//and the code fragment:
//What is the result
//public class Q7{
//    public enum Design {
//        CEO ('A'), СМО ('B'), CTO('C'), CFO('D');
//        char c;
//        private Design (char c) {
//            this.c = c;
//        }
//    }
//    public static void main(String[] args) {
//        Arrays.stream(Design.values()).dropWhile (s -> s.equals(Design.CMO));
//
//        switch (Design.valueOf("CMO")) {
//
//            case CEO -> System.out.println("Executive");
//
//            case CMO -> System.out.println("Marketing");
//
//            case CFO -> System.out.println("Finance");
//
//            case CTO -> System.out.println("Technical");
//
//            default -> System.out.println("UnDefined");
//
//        }
//    }
//}
/**
 * Q8:
 * Which statement is true about migration?
 * The required modules migrate before the modules that depend on them in a top-down migration.
 * Every module is moved to the module path in a bottom-up migration.
 * Unnamed modules are automatic modules in a top-down migration.
 * Every module is moved to the module path in a top-down migration
 *
 * Q9:
 * Which statement is true?
 * -> The --add-exports option is not allowed in a Java command.
 * -> The --add-exports option is always recommended in a Java command.
 * -> The --add-requires option is not allowed in a Java command.
 * -> The --add-requires option is allowed but not
 *
 * Q10:
 * Given the code fragment:
 * List<Integer> listOfNumbers = List. of (1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
 *
 * Which code fragment returns different values?
 *-> int sum = listOfNumbers.stream().reduce(0, Integer::sum) + 5;
 *-> int sum = listOfNumbers.parallelStream().reduce((m, n) m + n).orElse (5)+5;
 *-> int sum = listOfNumbers.parallelStream().reduce(0, Integer::sum) + 5 ;
 *-> int sum listOfNumbers.parallelStream().reduce(5, Integer::sum);
 *-> int sum = listOfNumbers.stream().reduce(5, (a, b) -> a+ b);
 *
 * */

//Q11
//class Pet {
//    String name;
//    Pet(String name) {
//        this.name = name;
//    }
//}
//class Q11{
//
//    public static void main(String[] args) {
//          Pet p = new Pet("Dog");
//          Pet pl = p;
//          pl.name = "Cat";
//          p = pl;
//          System.out.println(p.name);
//          p = null;
//          System.out.println(pl.name);
//    }
//}

    //Q12
//class OClass {
//    private int varl = 100;
//    public int var2 = 200;
//    class IClass {
//        int var3 = 300;
//        public int var4 = 400;
//        int m2 () {
//            return var2;
//        }
//    }
//    public int m1() {
//        return varl;
//    }
//}
//public class App {
//    public static void main(String[] args) {
//        OClass.IClass inner = new OClass().new IClass();
//    }
//}

//Q13
//abstract sealed interface SInt permits Story, Art { default String getTitle() { return "Book Title"; }
//}
//
////Which set of class definitions compiles?
//-> interface Story extends SInt {} interface Art extends SInt {}
//-> public interface Story extends SInt {} public interface Art extends SInt {}
//-> non-sealed interface Story extends SInt {} class Art implements SInt {}
//-> non-sealed interface Story extends SInt {}
//-> non-sealed interface Art extends SInt {}

//Q14
//class Q14{
//    public static void main(String[] args) {
//        String a =  "Hello! Java";
//        System.out.print(a.indexOf("Java"));
//        a.replace("Hello!", "Welcome!");
//        System.out.print(a.indexOf("Java"));
//        StringBuilder b = new StringBuilder(a);
//        System.out.print(b.indexOf("Java"));
////        What is the result?
//    }
//}

//Q15
//class Q15{
//    public static void main(String[] args) {
//        Integer grade = 5;
//        switch (grade) {
//            case 1,2,3 -> System.out.println("Region 1");
//            case 4,6 -> System.out.println("Region 2");
//            case 7,9 -> System.out.println("Region 3");
//            default -> System.out.println("Invalid grade.");
//        }
//        //What is the result?
//    }
//}

//Q16
//public class Test {
//    public static void main(String[] args) {
//        int a = 0, b = 1, c = 2;
//        if (Math.round(b/c) < b/c & b != b/++a) {
//            c += a+++b;
//        } else {
//            c-=--b+a;
//        }
//        System.out.println(c);
//    }
//}
//What is the result

//Q17
/**
 * Which statement is true?
 *
 *-> The lock () method returns a boolean indicator immediately regardless if it has or has not managed to acquire the lock
 *-> The tryLock () method returns a boolean indicator immediately if it has managed to acquire the lock, otherwise it waits for the lock acquisition
 *-> The tryLock () method returns a boolean indicator immediately regardless if it has or has not managed to acquire the lock.
 *-> The lock () method returns a boolean indicator immediately if it has managed to acquire the lock, otherwise it waits for the lock acquisition
 *
 * */

//Q18
//public class Test {
//    public void sum(int a, int b) { System.out.print(" A");
//    }
//    public void sum(int a, float b) { System.out.print(" B");
//    }
//    public void sum (float a, float b) { System.out.print("C");
//    }
//    public void sum (double... a) { System.out.print(" D");
//    }
//    public static void main(String[] args) {
//        Test t = new Test();
//        t.sum (10,15.25);
//        t.sum(10, 24);
//        t.sum(10.25,10.25);
//    }
//}

//What is the result?
//a) OBAD
//b)ODDD
//c)OBAC
//d)ODAD   right

//Q19
//public class Main {
//    void print(int i) {
//        System.out.println("hello");
//    }
//    void print (long j) {
//        System.out.println("there");
//    }
//    public static void main(String[] args) {
//        new Main().print(0b11011010);
//    }
//}
//What is the result?    A:hello

//Q20

//package p1;
//class ZeroValueException extends Exception {}
//
////and the code fragment:
//int a[] = {0,2,4};
//try {
//        try {
//        if (a[0] 0) throw new ZeroValueException();
//        } catch (ZeroValueException | NullPointerException zve) {
//        throw zve;
//        }
//} catch (Exception e) {
//        System.out.println("Caught " + e);
//}
//
//What is the result?  A:Caught ZeroValueException

//Q21
//public class TestApp {
//    public static void main(String[] args) {
//        try {
//            myMethod();
//        }
////line nl
//    }
//    public static void myMethod() throws NumberFormatException, ArrayIndexOutOfBoundsException{
//    int a[] = new int [2];
//    a [2] = 10;
//    }
//}
//Which catch block can be inserted at line n1
//A: catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
//            throw new RuntimeException(e);
//        }

//class Q22{
//    public static void main(String[] args) {
//        Stream.of (3, 6, 9, 12, 15, 18, 21, 24,27)
//                .takeWhile(s -> s% 3==0)
//                .dropWhile (s->s % 2 == 0)
//                .limit(3)
//                .forEach (s -> System.out.print(s + " "));
//        //What is the result?
//
//    }
//}
//A: 3,9,15

//Q23
//List<Integer> l1 =List. of (1, 3, 5, 7, 9);
//List<Integer> l2 =List.of (2, 4, 6, 8);
//List<List<Integer>> l3= List.of (l1, l2);
//
////line nl
//
//System.out.println(l4);
//
////Which code fragment at line n1 enables 14 to contain numbers greater than 5 from the lists 11 and 12?
//
//->List<Integer> 14 = 13.stream().map(x -> x.stream()).filter(y -> y > 5).collect (Collectors.toList());
//->List<Integer> 14 = 13.stream().flatMap(x -> x.stream().filter(y -> y > 5).toList();
//->List<Integer> 14 = 13.stream().flatMap(x -> x.stream()).filter(y -> y > 5).collect (Collectors.toList());
//->List<Integer> 14 = 13.stream().filter(y -> y > 5).collect();
//A: 3 and 2

//Q24
//package pl;
//public abstract sealed class Doc permits WordDoc (
//        String docName;
//        public abstract void printDoc();
//public String getName() { return docName;}
//}

//Which statement is true?
//->The WordDoc class could exist within another package, p2, of modulel.
//->The getName() method should be abstract.
//->The WordDoc class should exist within pl of modulel.
//->The Doc class must declare non-abstract.

//Q25
//abstract class Sport {
//    public void play() { System.out.print("a");};
//}
//class InDoor extends Sport {
//    public void play() {
//        System.out.print("b ");
//    }
//}
//class Badminton extends InDoor {
//    public void play() {
//        super.play();
//        System.out.print("c");
//    }
//}
//Sport s1 = new Badminton();
//InDoor s2 = new Badminton();
//Badminton s3 = new Badminton();
//sl.play();
//s2.play();
//s3.play();
//
//What is the result?
//->aababc
//->bcabbc
//->bcbcbc   right
//->abc

//Q26
//line nl
//String input = console.readLine ("Input a number: ");
//int number = Integer.parseInt(input);
//if (number % 2 == 0) {
//        System.out.println(number + "is even.");
//        } else {
//    System.out.println(number + "is odd");
//}
//
//Which code at line n1, obtains the java.io.Console object?
//
//->Console console = System.console (System.in);
//->Console console = new Console (new InputStreamReader (System.in));
//->Console console = System.console();
//->Console console = Console.getIntance();
//->Console console= new Console(System.in);

//Q27
//Given the content of the in.txt file:
//0123456789
//and the code fragment:
//char[] buffer = new char[8];
//int count = 0;
//try (FileReader in = new FileReader("in.txt");
//FileWriter out = new FileWriter("out.txt")) {
//        while((count = in.read(buffer)) != -1) {
//        out.write(buffer);
//}
//}
//What is the content of the out.txt file?

//Q28
//int saleAmount = 10000;
//NumberFormat format1 = NumberFormat.getCurrencyInstance (Locale.US);
//NumberFormat format2 = NumberFormat.getCompactNumber Instance (Locale.US, Style.SHORT);
//String res= format1.format(saleAmount);
//System.out.println(res);
//format2.format(Integer.valueOf(res));
//System.out.println(saleAmount);
//
//What is the result?

//Q29
//Which Wo statements are true about modules in the Java Platform Module System?

//->The module-info.java has to be located in the Java bin directory.
//->The classes in a module are loaded using class-path.
//->Packages within the module are hidden by default.
//->They support versioning of Java modules.
//->They are a group of related Java packages and resources such as XML files, images

//Q30
//float x = Math.round((1.0/3)*100)/10f/(((int)'a' == 0Xa) ? 0 : 3);
//
//What is the result?
//->0.0
//->Compilation fails.
//->An ArithmeticException is thrown.
//->1
//->Ο
//->1.1 right

//Q31
//int a = 2;
//int b = ~a;
//int c = a^b;
//boolean d=a<b & a > c++;
//        System.out.println(d + ""+ c);
//boolean e = a > b && a > c++;
//        System.out.println(e +"" + c);

//false 0
//true 1


//Q32
//Assuming that the data.txt file exists and has the following content:
//textl
//text2
//text3

//Given the code fragment:

//try {
//    Path p = new File("data.txt").toPath();
//    Stream<string> lines Files.lines(p);
//    String data = lines.collect (Collectors.joining("-"));
//    System.out.println(data);
//    String data2 = Files.readAllLines(p).get(3);
//    System.out.println(data2);
//} catch (IOException ex) {
//        System.out.println(ex);
//        }

//Q33
// Login time: 2021-01-12T21:58:18.8172
//Instant loginTime = Instant.now();
//Thread.sleep(1000);
// Logout time: 2021-01-12T21:58:19.880Z
//Instant logoutTime = Instant.now();
//loginTime = loginTime.truncatedTo(ChronoUnit.MINUTES);// line ni
//logoutTime = logoutTime.truncatedTo (ChronoUnit.MINUTES);
//if (logoutTime.isAfter (loginTime))
//    System.out.println("Logged out at: "+ logoutTime);
//else
//    System.out.println("Can't logout");

//What is the result?  can't logout

//Q34
//Daylight Saving Time (DST) is the practice of advancing clocks at the start of spring by one
//hour and adjusting them backward by one hour in autumn.
//Considering that in 2021, DST in Chicago (Illinois) ended on November 7th at 2 AM, and
//given the fragment:
//
//Zoneld zoneID ZoneId.of("America/Chicago");
//ZonedDateTime zdt ZonedDateTime.of(
//        LocalDate.of (2021, 11, 7),
//LocalTime.of(1, 30),
//zoneID
//);
//
//ZonedDateTime anHourLater = zdt.plusHours(1);
//System.out.println(zdt.getHour() == anHourLater.getHour() );
//        System.out.print(zdt.getOffset().equals(anHourLater.getOffset())
//        );
//What is the output?

//Q35
//public class Test {
//    public String attachl (List<String> data) {
//        return data.parallelStream().reduce("w", (n,m) -> n+m, String::concat);
//    }
//    public String attach2 (List<String> data) {
//        return data.parallelStream().reduce((1, p) -> 1+p).get();
//    }
//    public static void main(String[] args) {
//        Test t new Test();
//        var list = List.of("Table", "Chair");
//        String x t.attachl (list);
//        String y= t.attach2 (list);
//        System.out.print(x+ "+y);
//    }
//}
//What is the result?