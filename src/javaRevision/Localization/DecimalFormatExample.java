package javaRevision.Localization;

import java.text.DecimalFormat;

public class DecimalFormatExample {
    public static void main(String[] args) {
        double number = 12345.678;

        // Custom pattern: #,###.00
        DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
        System.out.println("Custom Format: " + decimalFormat.format(number));
    }
}

