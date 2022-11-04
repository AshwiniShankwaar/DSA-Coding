package GFG;

public class NthSmaller {
    public static void main(String[] args) {
        System.out.println(kthSmallest(new int[]{7,10,4,3,20,15},0,6,3));
    }
    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        int out = 0;
        int[] sortarr=mergesort(arr);
        out = sortarr[r-k];
        return out;
    }

    public static int[] mergesort(int[] arr) {
        int n = arr.length;
        int[] left = null;
        int[] right = null;
        if(n<2) return arr;
        int mid = n/2;
        if((n % 2) ==0){
            left = new int[mid];
            right = new int[mid];
            for (int i = 0; i < mid; i++) {
                left[i] = arr[i];
            }
            for (int i = mid; i <n ; i++) {
                right[i-mid] = arr[i];
            }
        }else{
            left = new int[mid];
            right = new int[mid+1];
            for (int i = 0; i < mid; i++) {
                left[i] = arr[i];
            }
            for (int i = mid; i <n ; i++) {
                right[i-mid] = arr[i];
            }
        }
        int[] l = mergesort(left);
        int[] r =mergesort(right);
        arr = sort(l,r,arr);
        return arr;
    }
    public static int[] sort(int[] l,int[] r,int[] arr){
        int i,j,k,nl,nr;
        i=j=k = 0;
        nr = r.length;
        nl = l.length;
        while (i<nl && j<nr){
            if(l[i]<=r[j]){
                arr[k] = l[i];
                i++;
                k++;
            }else{
                arr[k] = r[j];
                j++;
                k++;
            }
        }
        while(i<nl){
            arr[k] = l[i];
            i++;
            k++;
        }
        while(j<nr){
            arr[k] = r[j];
            j++;
            k++;
        }
        return arr;
    }
}
