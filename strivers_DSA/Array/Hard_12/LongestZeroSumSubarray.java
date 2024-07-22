import java.util.HashMap;

public class LongestZeroSumSubarray {

    public static int maxLen (int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if(sum == 0) {
                maxLen = i + 1;
            }

            if(map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main (String[] args) {
        int[] arr = {1, 2, -2, 4, -4};
        System.out.println("Length of the longest subarray with zero sum is " + maxLen(arr));
    }
}