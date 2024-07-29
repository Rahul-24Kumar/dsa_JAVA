public class SingleElementInSortedArray {

    public static int findSingleElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Ensure we always compare pairs
            if (mid % 2 == 1) {
                mid--;
            }

            // Check if the pair is broken
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2; // Move to the right half
            } else {
                right = mid; // Move to the left half
            }
        }

        // At the end of the loop, left == right and pointing to the single element
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 4, 8, 8, 9};
        int single = findSingleElement(nums);
        System.out.println("The single element is: " + single);
    }
}
