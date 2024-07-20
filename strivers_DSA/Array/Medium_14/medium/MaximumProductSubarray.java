// Kadane’s Algorithm

public class MaximumProductSubarray {

    public static int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            // when the current element is zero, reset maxProduct and minProduct to zero
            if (current == 0) {
                maxProduct = 0;
                minProduct = 0;
                result = Math.max(result, 0);
                continue;
            }

            // When the current element is negative, swap maxProduct and minProduct

            if (current < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            // Update the maxProduct and minProduct
            maxProduct = Math.max(current, maxProduct * current);
            minProduct = Math.min(current, minProduct * current);

            // Update the result with the maximum product found 
            result = Math.max(result, maxProduct);
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {-2, 3, 4, -1, 0, -2, 3, 1, 4, 0, 4, 6, -1, 4};
        int maxProduct = maxProduct(nums);
        System.out.println("Maximum product subarray: " + maxProduct);
    }
}