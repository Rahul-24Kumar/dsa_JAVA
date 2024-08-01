
public class SingleElementSearch {
    public static int findSingleElement(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int mid = low + (high-low)/2;

            // check if mid is even
            if (mid%2 == 1) {
                mid--;
            }

            // check the pair (mid, mid+1)
            if(arr[mid] == arr[mid+1]) {
                // If pair is found, move to the right half
                low = mid + 2;
            } else {
                // If pair is not found, the single element is in the left half
                high = mid;
            }
        }

        // When low == high, the single element is found
        return arr[low];
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int singleElement = findSingleElement(arr);
        System.out.println("The single element is: " + singleElement);
    }
}