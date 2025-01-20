package javaRevision.Localization;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatExample {
    public static void main(String[] args) {
        double number = 12345.678;

        // Format for US Locale
        NumberFormat usFormat = NumberFormat.getInstance(Locale.US);
        System.out.println("US Format: " + usFormat.format(number));

        // Format for Germany Locale
        NumberFormat germanyFormat = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println("Germany Format: " + germanyFormat.format(number));

        // Currency Format
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        System.out.println("Currency (Japan): " + currencyFormat.format(number));
    }
}

