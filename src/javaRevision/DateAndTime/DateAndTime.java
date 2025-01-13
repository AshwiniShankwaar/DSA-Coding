package javaRevision.DateAndTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAndTime {
    public static void main(String[] args) {

        //in java 8 we get a set of class inside time api such as clock,duration,localtime,localdatandtime,etc

//        LocalDate date  = LocalDate.now();
//        LocalDate date  = LocalDate.of(2020,1,1);
//        System.out.println(date);
//        System.out.println(date.getMonthValue());
//        System.out.println(date.getDayOfMonth());
//        System.out.println(date.atTime(LocalTime.MIDNIGHT));

        /**
         * LocalDate, LocalTime, LocalDateTime for date and time without time-zone.
         * ZonedDateTime for date and time with time-zone.
         * Duration for time-based differences.
         * Period for date-based differences.
         * Instant for timestamps.
         * */
        // LocalDate
        LocalDate today = LocalDate.now();
        LocalDate specificDate = LocalDate.of(2025, 1, 1);
        System.out.println(specificDate);
// LocalTime
        LocalTime now = LocalTime.now();
        System.out.println(now);
        LocalTime specificTime = LocalTime.of(14, 30);
        System.out.println(specificTime);

// LocalDateTime
        LocalDateTime dateTime = LocalDateTime.of(today, specificTime);
        System.out.println(dateTime);
// ZonedDateTime
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(zonedDateTime);
// Duration
        Duration duration = Duration.ofHours(5);
        //Duration d2 = Duration.between(start,end)
        System.out.println(duration); //it give duration between time interval it work with sec
// Period
        Period period = Period.between(LocalDate.of(2025, 1, 1), today);
        System.out.println(period); //it we have to get the period of two dates between the start and end
// Instant
        Instant timestamp = Instant.now();
        System.out.println(timestamp);//time in nano seconds from 1 jan of 1970

        DateTimeFormatter d = DateTimeFormatter.ofPattern("DD/MM/YY");
        LocalDate date = LocalDate.of(2002,12,25);
        date.format(d);
        System.out.println(date);

        ZoneId zone = ZoneId.of("Asia/Kolkata");
        ZonedDateTime zonedDateTime2 = ZonedDateTime.now(zone);

//        Calendar cal = new GregorianCalendar();
//        //it was introduced in java 1.1v it was not a alternative to date class but it was an
//        // extension to the date class.
//        System.out.println(cal.getTime());// give current time
//        //we can set time using set()
//        cal.set(2002,12,25,04,12,25);
//        System.out.println(cal.getTime());
//        cal.add(Calendar.DATE,500); //it will add day and adjust the complete date accordingly
//        System.out.println(cal.getTime());
//        System.out.println(cal.get(Calendar.DATE));
//        cal.roll(Calendar.DATE,50); //it will not adjust month but it will add mont till it reach
//        // 31 then it will start from the 1



//        Date date = new Date();
        //date is introduced in java 1.0 v and it is mutable in nature it calculates date with respect
        // with midnight of 1 jan 1970 date use + number to save date after i jan 1970 and
        //for before date it use negative number.
//        double sec = date.getTime()/1000;
//        double min = sec/60;
//        double hour = min/60;
//        double day = hour/24;
//        double month = day/30;
//        double year = day/365;
//        System.out.println("sec: " + sec + " min: " + min +" hour:"+hour +
//                " day:" + day + " month:" + month+" year:" + year);
//        System.out.println(date.compareTo(new Date()));
    }
}
