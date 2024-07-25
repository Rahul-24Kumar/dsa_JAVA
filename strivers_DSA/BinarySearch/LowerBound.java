
public class LowerBound {

    public static int lowerBound (int[] arr, int x) {
        int low = 0;
        int high = arr.length;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if(arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 6};
        int x = 2;
        
        int lb = lowerBound(arr, x);
        System.out.println("The lower bound of " + x + " is at index: " + lb);
    }
}