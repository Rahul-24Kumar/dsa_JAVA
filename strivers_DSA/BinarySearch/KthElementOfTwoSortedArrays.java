public class KthElementOfTwoSortedArrays {
    public  static int findKthElement(int[] arr1, int[] arr2, int k) {
        int m = arr1.length;
        int n = arr2.length;

        // Ensure the first array is the smaller one
        if (m > n) {
            return findKthElement(arr2, arr1, k);
        }

        int low = Math.max(0, k - n);
        int high = Math.min(k, m);

        while (low <= high) {
            int partition1 = (low + high) / 2;
            int partition2 = k - partition1;

            int maxLeft1 = (partition1 == 0) ? Integer.MIN_VALUE : arr1[partition1 - 1];
            int minRight1 = (partition1 == m) ? Integer.MAX_VALUE : arr1[partition1];

            int maxLeft2 = (partition2 == 0) ? Integer.MIN_VALUE : arr2[partition2 - 1];
            int minRight2 = (partition2 == n) ? Integer.MAX_VALUE : arr2[partition2];

            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                return Math.max(maxLeft1, maxLeft2);
            } else if (maxLeft1 > minRight2) {
                high = partition1 - 1;
            } else {
                low = partition1 + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted or k is out of bounds");
    }

    public static void main (String[] args) {
        int[] arr1 = {2, 3, 6, 7, 9};
        int[] arr2 = {1, 4, 8, 10};
        int k = 5;
        
        int result = findKthElement(arr1, arr2, k);
        System.out.println("The " + k + "-th element is: " + result); // Output: 6
    }
    }