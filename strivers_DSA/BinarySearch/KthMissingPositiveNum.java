public class KthMissingPositiveNum {
    public static int findKthMissing(int[] arr, int k) {
        int low = 0, high = arr.length-1;

        while (low <= high) {
            int mid = low + (high-low)/2;
            int missingCount = arr[mid] - (mid+1);

            if(missingCount < k) {
                low = mid + 1;      // look in the right half
            } else {
                high = mid - 1;     // look in the left half
            }
        }

        // After bs, low is the position where Kth missing number fits
        return low + k;
    }

    public static void main (String[] args) {
        int[] arr = {2, 3, 4, 7, 11};

        int k = 5;
        int result = findKthMissing(arr, k);
        System.out.println("The " + k + "th missing positive number is: " + result);
    }
}