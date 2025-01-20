package javaRevision.Localization;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        // Default Format
        DateTimeFormatter defaultFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Default Format: " + now.format(defaultFormatter));

        // French Locale
        DateTimeFormatter frenchFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.FRENCH);
        System.out.println("French Format: " + now.format(frenchFormatter));

        // Japanese Locale
        DateTimeFormatter japaneseFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日", Locale.JAPAN);
        System.out.println("Japanese Format: " + now.format(japaneseFormatter));
    }
}

