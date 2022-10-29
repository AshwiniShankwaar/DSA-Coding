package extra;

public class trilogy1 {
    public static void main(String[] args) {
        int a = 4,b=7;
        int[] f = new int[a+1];
        int count = 0;
        for (int i = 1; i < a+1; i++) {
            if(i ==1){
                f[i] = 1;
                int n = f[i]+b;
                if(checkprime(n)) count++;
            }else{
                f[i] = f[i-1]*i;
                int n = f[i]+b;
                if(checkprime(n)) count++;
            }
        }
        System.out.println(count);
    }

    private static boolean checkprime(int num) {
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        return !flag;
    }
}
