package extra;
import java.util.*;
public class ankitTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.next();
        String str2 = scan.next();
        int count = 0;

        // Convert strings to char arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        HashSet<Character> set = new HashSet<Character>();
        HashSet<Character> set2 = new HashSet<Character>();

        // Loop through each character of the first string
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);

        }

        for (int i = 0; i < arr2.length; i++) {
            set2.add(arr2[i]);
        }
        Object[] data = set2.toArray();
        for (int i = 0; i < data.length; i++) {
            if (set.contains(data[i])) {
                count++;
            }
        }

        if (count < 2) {
            System.out.println("2");
        } else if (2 <= count && count < 5) {
            System.out.println("10");
        } else {
            System.out.println("15");
        }
    }
}
