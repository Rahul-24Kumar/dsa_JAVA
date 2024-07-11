import java.util.HashMap;

class LongestSubArryWithSumPositiveNegativeK {

    public static int LongestSubArryWithSumK (int[] arr, int k) {

        HashMap <Integer, Integer > map = new HashMap<>();

        int maxLength = 0;
        int commulativeSum = 0;

        for(int i=0; i<arr.length; i++) {
            commulativeSum += arr[i];

            if(commulativeSum == k) {
                maxLength = i + 1;
            }

            if(map.containsKey(commulativeSum-k)){
                maxLength = Math.max(maxLength, i - map.get(commulativeSum-k));
            }

            if(!map.containsKey(commulativeSum)){
                map.put(commulativeSum, i);
            }
        }

      return  maxLength;

    }

    public static void main (String[] args) {

        int[] arr = {10, 2, -2, -20, 10};
        int K = -10;
        int maxLength = LongestSubArryWithSumK(arr, K);
        System.out.println("The length of the longest subarray with sum " + K + " is: " + maxLength);
    }
}
