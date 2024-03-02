package extra;

import java.util.Scanner;

public class Avi {
    public static void main(String[] args) {
        System.out.println(stringclange(new Scanner(System.in).nextLine()));
    }
    public static String stringclange(String str){
        //str = str.toLowerCase();
        String[] words = str.split("\\s+");
        String result = "";
        int maxRepeatedLetters = 0;
        for (String word : words) {
            int[] letters = new int[26];
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if(c>='a' && c<='z')
                   letters[c - 'a']++;
                else if(c>='A' && c<='Z')
                    letters[c - 'A']++;
            }
            int repeatedLetters = 0;
            for (int count : letters) {
                if (count > 1) {
                    repeatedLetters += count;
                }
            }
            if (repeatedLetters > maxRepeatedLetters) {
                maxRepeatedLetters = repeatedLetters;
                result = word;
            }
        }
        if(result.equals("")){
            return "-1";
        }
        return result;
    }

    public static class Avi1 {
        public static void main(String[] args) {

        }
        public static int ArrayChallenge(int[] arr){
            int index = -1;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]<arr[i-1] && arr[i]<arr[i+1]){
                    index = i;
                }
            }
            return index;
        }
    }
}
