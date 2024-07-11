
class LongestSubarrayWithSumK {

    public static int longestSubArrSum (int[] arr, int k) {

        int maxLength = 0;
        int currentSum = 0;
        int start = 0;

        for (int end =0; end<arr.length; end++) {

            currentSum += arr[end];

            while(currentSum > k && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            if(currentSum == k) {
                maxLength = Math.max(maxLength, end - start + 1);
            }
        }

        return maxLength;
        
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int K = 12;
        int maxLength = longestSubArrSum(arr, K);
        System.out.println("The length of the longest subarray with sum " + K + " is: " + maxLength);
    }

}