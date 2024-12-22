package javaRevision.regrex;

import java.util.regex.Pattern;

public class EmailCheck {
    public static void main(String[] args) {
//        String email = "[0-9A-Za-z][a-zA-Z0-9_]*@[a-zA-Z]+\\.[a-zA-Z]{2,}$";
//        String check_email = "ashwinishankwaar@gmail.com";
//        Pattern p = Pattern.compile(email);
//        System.out.println(p.matcher(check_email).matches());
        String s = "^[0-9a-zA-Z]{2,}$a+";
        String s1 = "As";
        Pattern p = Pattern.compile(s);
        System.out.println(p.matcher(s1).matches());
    }
}
