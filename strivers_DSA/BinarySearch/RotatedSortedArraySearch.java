public class RotatedSortedArraySearch {
    public static int search (int[] nums, int target) {

        if (nums == null  || nums.length == 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left)/2;

            if (nums[mid] == target) {
                return mid;
            }

            // Determine which part is sorted
            if(nums[left] <= nums[mid]) {       // left part is sorted
                if(nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {        // Right part is sorted
                if(nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;          // target not found
    }

    public static void main (String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int index = search(nums, target);
        System.out.println("Element found at index: " + index);
    }
}