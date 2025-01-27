package javaRevision.Basic;

import static java.lang.StringTemplate.RAW;

public class BasicJava {
    public static void main(String[] args) {
        /**
         * identifiers: name given  to variable method classes and other programming elements.
         *
         * rules: it should contain a-z,A-Z,0-9,$,_ and it should start with a-z,A-Z,or $,_ but
         * cannot start with digit
         *
         * Variables and methods: camelCase
         * Class names: PascalCase .
         * Constants: UPPER_CASE with underscores.
         * */
        //primitive data types
        /**
         * Primitive Data Types:
         * * Store actual values: Primitive types store the actual value of the data directly in memory.
         * * Fixed size: Each primitive type has a predefined size in memory.
         * * Limited number: Java has eight primitive data types: byte, short, int, long, float, double, char, and boolean.
         * * Lowercase naming: Primitive type names are typically lowercase.
         * */
        // Numeric types:
        byte start = -128;
        byte end = 127; //byte range is -128 to 127
        System.out.println(STR."byte range: \{start} to \{end}");

        short sShort = ((short)-Math.pow(2,15));
        short eShort = (short) (((short)Math.pow(2,15))-1);
        System.out.println(STR."short range: \{sShort} to \{eShort}");

        int sInt = -(int)(Math.pow(2,31));
        int eInt =  (((int)Math.pow(2,31))-1);
        System.out.println(STR."int range: \{sInt} to \{eInt}");

        /**
         * StringTemplate is the run-time representation of a string template or text block template
         * in a template expression.
         * */

        int x = 10;
        int y = 20;
        StringTemplate st = RAW."x: \{x},y: \{y}, x+y: \{x+y}";
        System.out.println(st.fragments().toString());//fragments will be equivalent to List.of("x: ",",y: ",",x+y: ")
        System.out.println(st.values().toString());//values will be equivalent to List.of(10,20,30)
        //interpolate() method provides a direct way to perform string interpolation of a StringTemplate
        System.out.println(StringTemplate.interpolate(st.fragments(),st.values()));
        String s = STR."x: \{x},y: \{y}, x+y: \{x+y}";
        System.out.println(s);

        long sLong = -(long)Math.pow(2,63);
        long eLong = (long)Math.pow(2,63)-1;
        System.out.println(STR."sLong: \{sLong}, eLong: \{eLong}");

        double d = 2.6789;//when need more than 14 to 15 decimal points accuracy
        float f = 2.67584f;//when need more than 5 to 6 decimal points accuracy

        System.out.println(STR
                ."d: \{((Object)d)
                .getClass().getSimpleName()}, f: \{((Object)f)
                .getClass().getSimpleName()}");

        //Non-numerical Type

        boolean b = false || true;
        char c = 'a';
        System.out.println(STR."b: \{b}, c: \{c}");

        int octaLiterals = 010;
        int hexaLiterals = 0x10; //while printing, it will convert into integer
        System.out.println(STR."octaLiterals: \{octaLiterals}, hexaLiterals: \{hexaLiterals}");
        int binaryLiteral = 0b11011010;
        System.out.println(STR."binaryLiteral: \{binaryLiteral}");



    }
}
