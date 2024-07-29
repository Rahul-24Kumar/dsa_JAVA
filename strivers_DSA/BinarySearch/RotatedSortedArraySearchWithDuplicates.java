public class RotatedSortedArraySearchWithDuplicates {

    public static boolean search(int[] nums, int target) {

        if(nums == null || nums.length == 0) {
            return false;
        }

        int left = 0; 
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left)/2;

            if (nums[mid] == target) {
                return true;
            }

            // Handle duplicates: skip duplicates
            if(nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left++;
                right--;
            } else if (nums[left] <= nums[mid]) {   // left part is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            
        } else {
            if (nums[mid] < target && target <= nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }
    return false;   // target not found
}

public static void main (String[] args) {
    int[] nums = {2, 5, 6, 0, 0, 1, 2};
    int target = 0;
    boolean result = search(nums, target);
    System.out.println("Is target present: " + result);
}
}