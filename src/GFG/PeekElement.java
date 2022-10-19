package GFG;

public class PeekElement {
    public static void main(String[] args) {
        System.out.println(peakElement(new int[]{1,2,3},3));
    }
    public static int peakElement(int[] arr,int n)
    {
        int peek;
        if(n==1){
            return 0;
        }
        peek = 0;
        for(int i = 1;i<n;i++){
            if(arr[peek]<arr[i]) peek = i;
        }
        return peek;
    }
}
