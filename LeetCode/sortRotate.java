public class sortRotate {
    public static boolean check(int[] nums) {
        int count = 0; // Counter for the number of order breaks
        int n = nums.length; // Length of the array
        
        // Loop through the array to find the number of order breaks
        for (int i = 0; i < n; i++) {
            // Compare current element with the next element (circular)
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            // If there is more than one order break, return false
            if (count > 1) {
                return false;
            }
        }
        
        // If zero or one order break, return true
        return true;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 4, 5, 1, 2};
        int[] nums2 = {2, 1, 3, 4};
        int[] nums3 = {1, 2, 3};

        System.out.println(check(nums1)); // Expected Output: true
        System.out.println(check(nums2)); // Expected Output: false
        System.out.println(check(nums3)); // Expected Output: true
    }
}
