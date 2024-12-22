package extra;

public class AnkitaTest {
    public static void main(String[]args){
        int[] arr = new int[50];

        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*(500 - 100 + 1)+100);
        }
        //Call the method to sort the array
        sort(arr);
        //array print after sorting
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        //Call the method to search the elements present in the array bellow
        int[] searchData = {104,121,250,290,340,370,441,447,289,arr[12],arr[39],arr[42]};
//        int[] searchData = {104,121,250,290,340,370,441,447,289,arr[4],arr[7],arr[9]};
        // search these elements in the array 'arr' if the element is present then return an array with the
        //positions of these elements in the array 'arr'. if the element is not in the array then position
        //is -1.
        search(searchData,arr);
        System.out.println();
        //positions of the element are printed after the search
        for (int i = 0; i < searchData.length; i++) {
            System.out.print(searchData[i]+" ");
        }
    }

    public static void sort(int[] arr) {
        if(arr.length<2){
            return;
        }
        int mid = arr.length/2;
        int[] left = new int[mid];
        int[] right = new int[arr.length-mid];
        for (int i = 0; i <= mid-1; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            right[i-mid] = arr[i];
        }
        sort(left);
        sort(right);
        merge(left,right,arr);
    }
    public static void merge(int[] left,int[] right,int[] arr){
        int nl = left.length;
        int nr = right.length;
        int i,j,k;
        i=j=k=0;
        while (i<nl && j<nr){
            if(left[i]<=right[j]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i<nl){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j<nr){
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void search(int[] searchData, int[] arr) {
        for (int i = 0; i < searchData.length; i++) {
            int num = searchData[i];
            int start = 0;
            int end = arr.length;
            while (start<=end){
                int mid = (start+end)/2;
                if(arr[mid]==num){
                    searchData[i] = mid;
                    break;
                } else if (num<arr[mid]) {
                    end = mid-1;
                } else if (num>arr[mid]) {
                    start = mid+1;
                }
            }
            if(searchData[i] == num){
                searchData[i] = -1;
            }
        }
    }

}
