
public class MinimumInRotatedSortedArray {
    public static int findMin (int[] nums) {
        if(nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Input array is null or empty");
        }

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left)/2;

            // If mid element is greater than the rightmost element, the minimum is the right part
            if(nums[mid] > nums[right]) {
                left = mid + 1;
            } else {        // Otherwise , the mininmum is in the left part (includin mid)
                right = mid - 1;
            }
            
        }

        // At the end of the loop, left == right and pointing to the minimum element
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int min = findMin(nums);
        System.out.println("The minimum element is: " + min);
    }
}