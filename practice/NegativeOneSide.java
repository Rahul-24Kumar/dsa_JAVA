public class NegativeOneSide {
    public static void main(String[] args) {
        int[] nums = {7, -3, 8, -5, 9, -1, 2, 4, 0, -6};

        moveElement(nums);

        System.out.println("Negative one side");

        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void moveElement(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Increment left index while we see negative numbers
            while (array[left] < 0 && left < right) {
                left++;
            }

            // Decrement right index while we see non-negative numbers
            while (array[right] >= 0 && left < right) {
                right--;
            }

            // If left is less than right, then there is a positive number at left
            // and a negative number at right. Swap them.
            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
    }
}
