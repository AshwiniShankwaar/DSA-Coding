package Target100In30DaysEnd16JanLeetCode;

/**
 * Question :
 * You are given a large integer represented as an integer array digits, where each digits[i]
 * is the ith digit of the integer. The digits are ordered from most significant to least
 * significant in left-to-right order. The large integer does not contain any leading 0's.
 *
 * Increment the large integer by one and return the resulting array of digits.
 *
 * */
public class PlusOne {

    /**
     * this method will provide the plusone of the number formed by the digits on the array
     *
     * @param digits array of digits
     * @return array of digits after performing plusone the number formed by the digits on the array
     * */
    public int[] plusOne(int[] digits) {
        

        //new logic
        int carray = 1;
        for (int i = digits.length-1; i >=0; i--) {
            int sum = digits[i]+carray;
            if(sum == 10){
                digits[i] = 0;
                carray = 1;
            }else{
                digits[i] = sum;
                carray = 0;
                break;
            }
        }

        if(carray == 1){
            int[] arr = new int[digits.length+1];
            for (int i = arr.length-1; i > 0 ; i--) {
                arr[i] = digits[i-1];
            }
            arr[0] = carray;
            return arr;
        }


        //will not work
//        long num = 0;
//        for (int i = 0; i < digits.length; i++) {
//            num*=10;
//            num+=digits[i];
//        }
//        num+=1;
//        ArrayList<Integer> i = new ArrayList<Integer>();
//        while (num>9){
//            long d = num%10;
//            i.add((int)d);
//            num/=10;
//        }
//        i.add((int)num);
//        int[] arr = i.reversed().stream().mapToInt(x->x).toArray();
//        return arr;
        return digits;
    }
}
