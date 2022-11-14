package extra.Coursera;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumPairwiseProduct {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        //BigInteger count = BigInteger.ZERO;
//        while(true) {

//            ArrayList<BigInteger> list = new ArrayList<>();
        ArrayList<Long> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                list.add((long) s.nextInt());
            }
//            System.out.println(Arrays.toString(list.toArray()));
            long p = Maxproduct(list);
        System.out.println(p);
//            //BigInteger p2 = product(list);
//            if(p.compareTo(p2) == 0)
//            System.out.println("ok"+" "+p + " " + p2);
//            else{
//                System.out.println("wrong"+" "+p + " " + p2);
//                break;
//            }
//            list = null;
//            System.out.println("test id:" + count);
//            count = count.add(BigInteger.valueOf(1));

//        }

    }

    private static long Maxproduct(ArrayList<Long> list) {
       long out = 0;
       long max = 0, max2 = 0;
        for (long x:list) {
            if(x>max2){
                max2 = x;
                if(max2>max){
                    long temp = max2;
                    max2 = max;
                    max = temp;
                }

            }
        }
        //System.out.println(max+" "+max2);
        out = max*max2;
        return out;
    }
    /*private static BigInteger product(ArrayList<BigInteger> list) {
        BigInteger out = null;
        BigInteger max = BigInteger.ZERO, max2 =BigInteger.ZERO;
        BigInteger indesx = null;
        for (BigInteger x:list) {
            if(x.compareTo(max) == 1){
                max = x;
                indesx = BigInteger.valueOf(list.indexOf(max));
            }
        }
        int k = 0;
        for (int i = 0;i< list.size();i++) {
            if(list.get(i).compareTo(max2) == 1 && !indesx.equals(BigInteger.valueOf(i))){
                max2 = list.get(i);
                k=i;
            }
        }
        System.out.println(max+" "+indesx+" "+max2+" "+BigInteger.valueOf(k));
        out = max.multiply(max2);
        return out;
    }*/
}
