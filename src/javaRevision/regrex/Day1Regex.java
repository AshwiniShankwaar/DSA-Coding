package javaRevision.regrex;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day1Regex {
    public static void main(String[] args){
//        String s = ".*^hello.*"; //line start with hello
//        String s = ".*error$.*"; //line end with error
//        String s = ".*a+.*"; //line having a in it.
//        String s = ".*a{2}.*"; //line with aa in it.
//        String s = ".*[^a.*].*"; //word not start with a
//        String s = "[a-z]"; //single car between a to z
//        String s = "[a-z]+"; //words contain between a-z
//        String s = "[^0-9]+";//non numeric words
//        String s = "[0-9]*nd[.]"; //ex 2nd.
//        String s = "[a-zA-Z0-9]+"; //alphanumeric
//        String s = "[a-zA-Z0-9]+@[0-9]+"; //ashwini@12345
        //atlist 1 a-z 1 A-Z 1 0-9 1[.*@/]
//        String s = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[.*@/]).+$";
//        String s = "^(?=.*[a-z])(?!.*[A-Z]).+$";
//        String s = "[0-9]{10}";
//        String s = "^[A-Za-z0-9.$_]+@[a-zA-Z0-9]+\\.[a-zA-Z].*$";
        //error error_code line
        String s = "^error(?=\\s*[0-9]+).*$";
        Pattern p = Pattern.compile(s);

        File file = new File("./src/javaRevision/regrex/test.txt");
        try {
            FileReader r = new FileReader(file);
            BufferedReader br = new BufferedReader(r);
            String line = br.readLine();
            while(line != null){
                //System.out.println(line);

//                 Arrays.stream(
//                         line.split(" "))
//                         .filter(x ->p.matcher(x).matches())
//                         .forEach(System.out::println);

                Matcher m = p.matcher(line);
                if(m.matches()){
                    System.out.println(line);
                }
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
