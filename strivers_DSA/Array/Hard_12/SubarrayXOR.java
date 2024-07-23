import java.util.HashMap;

public class SubarrayXOR {
    public static int countSubarraysWithXOR(int[] nums, int K) {
        HashMap<Integer, Integer> xorCountMap = new HashMap<>();
        int prefixXor = 0;
        int count = 0;

        // Initialize the hash map with 0 XOR prefix count
        xorCountMap.put(0, 1);

        for (int num : nums) {
            // update the prefix XOR

            prefixXor ^= num;

            // Check if there is a prefix XOR such that (PrefixXor ^ target) = K
            if (xorCountMap.containsKey(prefixXor ^ K)) {
                count += xorCountMap.get(prefixXor ^ K);
            }

            // Update the frequency of the current prefix XOR in the hash map
            xorCountMap.put(prefixXor, xorCountMap.getOrDefault(prefixXor, 0) + 1);
        }

        return count;
    }

    public static void main (String[] args) {
        int[] nums = {4, 2, 3, 6, 1};
        int K = 6;

        System.out.println("Count of subarrays with XOR " + K + " is " + countSubarraysWithXOR(nums, K));
    }
}