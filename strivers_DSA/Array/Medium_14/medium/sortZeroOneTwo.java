import java.util.Arrays;

// Dutch National Flag algorithm

class sortZeroOneTwo  {

    public static int[] sortZeroOneTwo (int[] arr) {

       int low = 0;
       int mid=0;
       int high=arr.length-1;

       while(mid<=high){
        if(arr[mid] == 0) {
            int temp0 = arr[low];
            arr[low] = arr[mid];
            arr[mid] = temp0;
            low++;
            mid++;
        } else if (arr[mid]==1) {
            mid++;
        } else {
            int temp1 = arr[mid];
            arr[mid] = arr[high];
            arr[high] = temp1;
            high--;
        }
       }

       return arr;
    }

    public static void main (String[] args) {
        int[] arr = {2,0,2,1,1,0};

        int[] result = sortZeroOneTwo(arr);

        System.out.println(Arrays.toString(result));
    }
}