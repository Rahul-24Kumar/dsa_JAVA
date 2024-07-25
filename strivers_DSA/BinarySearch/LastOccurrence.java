
public class LastOccurrence {

    public static int findLastOccurrence (int[] arr, int x) {
        int low = 0;
        int high = arr.length;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] == x) {
                result = mid;
                low = mid + 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int x = 2;
        
        int index = findLastOccurrence(arr, x);
        System.out.println("The last occurrence of " + x + " is at index: " + index);
    }
}