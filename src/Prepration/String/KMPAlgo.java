package Prepration.String;

public class KMPAlgo {
    public int algo(String s,String pattern){
        int i = 0;
        int j = 0;
        while(i<s.length()&& j<pattern.length()){
            if(s.charAt(i) == pattern.charAt(j)){
                j++;
                i++;
            }else{
                if(j==0) i++;
                while(j>0){
                    if(pattern.charAt(j) != s.charAt(i)){
                        j--;
                    }else{
                        break;
                    }
                }
            }
        }
        if(j == 0) return -1;
        int index = i-j;
        return index;
    }

    public static void main(String[] args) {
        KMPAlgo algo = new KMPAlgo();
//        algo.algo("abxabcabcaby","abcaby");
        algo.algo("mississippi","issip");
    }
}
