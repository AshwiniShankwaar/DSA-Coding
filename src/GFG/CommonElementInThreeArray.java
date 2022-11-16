package GFG;

import java.util.*;

import static java.util.Arrays.*;

public class CommonElementInThreeArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = commonElements(new int[]{1, 5, 10, 20,20, 40, 80},new int[]{6, 20,20, 80, 100},new int[]{3, 4, 15, 20, 30, 70, 80, 120},7,5,8);
        for (int l:list) {
            System.out.println(l);
        }
    }
    public static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> A1 = new HashSet<Integer>();
        for (int a: A) {
            A1.add(a);
        }
        Set<Integer> B1 = new HashSet<Integer>();
        for (int a: B) {
            B1.add(a);
        }
        Set<Integer> C1 = new HashSet<Integer>();
        for (int a: C) {
            C1.add(a);
        }
        for (int x:A1) {
            if(B1.contains(x)){
                if(C1.contains(x)){
                    list.add(x);
                }
            }
        }
        Collections.sort(list);
        return list;
    }
}
