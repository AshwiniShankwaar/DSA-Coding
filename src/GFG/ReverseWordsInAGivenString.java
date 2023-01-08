package GFG;

public class ReverseWordsInAGivenString {
    public static void main(String[] args) {
        System.out.println(reverseWords("i.like.this.program.very.much"));
    }
    public static String reverseWords(String S)
    {
        // code here
        String[] str = S.split("\\.");
        String out = null;
        for ( int i = str.length-1;i>=0;i--) {
            if (out==null){
                out = str[i];
            }else{
                out = out+"."+str[i];
            }
        }
        return out;
    }
}
