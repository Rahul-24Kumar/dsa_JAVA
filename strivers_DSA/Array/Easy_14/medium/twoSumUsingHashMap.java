import java.util.HashMap;
import java.util.Arrays;

class twoSumUsingHashMap {
    
    public static int[] twoSum(int[] nums, int target) {
      HashMap <Integer, Integer>  seenNumbers = new HashMap<>();

    for(int i=0; i<nums.length; i++) {
    int complement = target - nums[i];

        if(seenNumbers.containsKey(complement)) {
            return new int[]{seenNumbers.get(complement), i};
            }
            seenNumbers.put(nums[i], i);
        }

            return null;

        }

        public static void main(String[] args) {
            int[] arr = {2,6,5,8,11};
            int target = 14;
     
            int[] result = twoSum(arr, target);
     
            if(result == null) {
             System.out.println("No pair exist!");
            } else {
             System.out.println(Arrays.toString(result));
            }
        }
}