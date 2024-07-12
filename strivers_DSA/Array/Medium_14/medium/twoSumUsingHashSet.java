import java.util.HashSet;
import java.util.Arrays;

// tc: O(n)
// sc: O(n)

class twoSumUsingHashSet {

    public static int[] twoSumArr (int[] arr, int targetSum) {
        HashSet<Integer> seenNumbers = new HashSet<>();
        
        for(int num: arr) {

            int complement = targetSum - num;
            if(seenNumbers.contains(complement)) {
                return new int[]{complement, num};
            } 
            seenNumbers.add(num);
        }

        return null;
    }

    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int targetSum = 14;
 
        int[] result = twoSumArr(arr, targetSum);
 
        if(result == null) {
         System.out.println("No pair exist!");
        } else {
         System.out.println(Arrays.toString(result));
        }
    }
}