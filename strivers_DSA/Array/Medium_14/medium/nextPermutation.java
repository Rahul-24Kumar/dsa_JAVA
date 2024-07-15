class nextPermutation {
    
    public static int[] nextPermutation(int[] nums) {
        // Null check and edge case
        if (nums == null || nums.length <= 1) {
            return nums;
        }

        int n = nums.length;
        int k = n - 2;

        // Find the first decreasing element from the end
        while (k >= 0 && nums[k] >= nums[k + 1]) {
            k--;
        }

        if (k == -1) {
            // If no such element is found, reverse the entire array
            reverse(nums, 0, n - 1);
        } else {
            // Find the next greater element to swap with nums[k]
            for (int i = n - 1; i > k; i--) {
                if (nums[i] > nums[k]) {
                    // Swap the elements
                    int temp = nums[k];
                    nums[k] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
            // Reverse the array segment from k + 1 to the end
            reverse(nums, k + 1, n - 1);
        }

        return nums;
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1};

        int[] result = nextPermutation(arr);
        // Print the result array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
