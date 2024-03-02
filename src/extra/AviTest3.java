package extra;

public class AviTest3 {
    public static void main(String[] args) {
        System.out.println(StringChallange("aabbcde"));
    }
    public static String StringChallange(String str){
        str = str.toLowerCase();
        int[] c = new int[26];
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                c[str.charAt(i)-'a']++;
            }
        }
        str = "";
        for (int i = 0; i < c.length; i++) {
            if(c[i] != 0){
                char data = (char) ('a'+i);
                str=str+c[i]+data;
            }
        }
        return str;
    }
}
