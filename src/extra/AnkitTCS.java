package extra;

import java.util.Scanner;

public class AnkitTCS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String output = "";
        for (int i = 0; i < text.length(); i++) {
            if((text.charAt(i) == 'E' && text.charAt(i+1) == 'F')||(text.charAt(i) == 'F' && text.charAt(i-1) == 'E')){
                continue;
            } else if (text.charAt(i) == 'G') {
                continue;
            }else{
                output+=text.charAt(i);
            }
        }
        System.out.println(output);
    }
}
