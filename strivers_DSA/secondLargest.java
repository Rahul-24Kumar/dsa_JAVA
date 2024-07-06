import java.io.*;


class secondLargest {
    
    public static int largestSecond (int n, int arr []) {

        if(n <= 0) {
            System.out.println("Invalid!");
            return -1;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i<n; i++) {
            if(arr[i] > max) {

                secondMax = max;
                max = arr[i];
             
            }  else if(arr[i] > secondMax & secondMax != max) {
                secondMax = arr[i];
            }
           
        } 
        return secondMax;
        }

    public static void main(String [] args) {

        int[] arr = {4, 8, 3, 9, 7, 2, 0, 11};
        int n = arr.length;

        System.out.println("Second Largest element is:" + largestSecond(n, arr));
    }
}