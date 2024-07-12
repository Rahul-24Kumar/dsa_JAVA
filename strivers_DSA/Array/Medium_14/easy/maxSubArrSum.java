import java.util.*;

// Kadane's Algorithm

class maxSubArrSum {

    public static long maxSubArr (int[] arr) {

        long max = Long.MIN_VALUE;
        long sum = 0;

        for(int i =0; i<arr.length; i++) {
            sum += arr[i];

            if(sum > max) {
                max = sum;
            }

            if(sum <0) {
                sum =0;
            }
        }

        return max;
    }

    public static void main (String[]args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        long maxSum = maxSubArr(arr);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}