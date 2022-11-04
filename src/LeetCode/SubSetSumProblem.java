package LeetCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class SubSetSumProblem {
    public static void main(String[] args) throws Exception{
        //just for the file input test
        BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
        String data = bufferedReader.readLine();
        String[] dataset = data.split(" ");
        for (String s: dataset) {
            String set = s.replaceAll("\\(", "")
                    .replaceAll("\\)", "")
                    .replaceAll("\\[", "")
                    .replaceAll("]", " ");
            String[] arraySet = set.split(" ");
            String[] arr = arraySet[0].split(",");
            int[] l = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                l[i] = Integer.parseInt(arr[i]);
            }
            long sum = Long.parseLong(arraySet[1]);
            ArrayList<Integer> out = subset(l, 15);
            for (int i : out) {
                System.out.print(i + " ");
            }
        }

    }

    public static ArrayList<Integer> subset(int[] arr, int sum) {
        ArrayList<Integer> out = new ArrayList<>();
        Boolean[][] r = new Boolean[arr.length+1][sum+1];
        for (int i = 0; i < sum+1; i++) {
            r[0][i] = false;
        }
        for (int i = 0; i < arr.length+1; i++) {
            r[i][0] = true;
        }
//        for (int i = 1; i < sum+1; i++) {
//            for (int j = 1; j < arr.length+1; j++) {
//                if(arr[j-1]<=i){
//                    //select
//                    int k = i-arr[j-1];
//                    r[j][i] = r[j-1][k];
//                }else{
//                    //reject
//                    r[j][i] = r[j-1][i];
//                }
//            }
//        }
        for (int i = 1; i < arr.length+1 ; i++) {
            for (int j = 1; j < sum+1; j++) {
                if(j>=arr[i-1])
                r[i][j] = r[i-1][j]||r[i-1][j-arr[i-1]];
                else r[i][j] = r[i-1][j];
            }
        }
        if(r[arr.length][sum]){
            int i = arr.length;
            int j = sum;
            while(j>0){
                if(r[i][j]==r[i-1][j]){
                    //not select
                    i = i-1;
                }else{
                    //select
                    out.add(arr[i-1]);
                    j=j-arr[i-1];
                    i = i-1;
                }
            }
        }else{
            out.add(-1);
        }
        return out;
    }


}
