package javaRevision.otherTypeClasses;

public class DayOfWeek {
    enum Month{
        January,
        February,
        March,
        April,
        May,
        June,
        July,
        August,
        September,
        October,
        November,
        December
    }
    public static void main(String[] args) {
        Week day1 = Week.Sunday;
        System.out.println(day1.toString());
        Month m = Month.December;
        System.out.println(m.toString());



//        switch (day1){
//            case Sunday: System.out.printf("Today is %s",day1.name());
//                break;
//            case Monday: System.out.printf("Today is %s",day1.name());
//                break;
//            case Tuesday: System.out.printf("Today is %s",day1.name());
//                break;
//            case Wednesday: System.out.printf("Today is %s",day1.name());
//                break;
//            case Thursday: System.out.printf("Today is %s",day1.name());
//                break;
//            case Friday: System.out.printf("Today is %s",day1.name());
//                break;
//            case Saturday: System.out.printf("Today is %s",day1.name());
//                break;
//            default: System.out.println("Not a valid day");
//            break;
//        }
    }
}
