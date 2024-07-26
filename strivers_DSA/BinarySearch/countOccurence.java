public class countOccurence {

    public static int countOccurrences (int[] arr, int x) {
        int first = findFirstOccurence(arr, x);
        int last = findLastOccurence(arr, x);

        if (first == -1) {
            return 0;
        }

        return last - first + 1;
    }

    private static int findFirstOccurence(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while(low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] < x) {
                low = mid + 1;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                result = mid;
                high = mid - 1;
            }
        }
        return result;
    }

    private static int findLastOccurence(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while(low<=high) {
            int mid = (low + high) / 2;

            if(arr[mid] < x) {
                low = mid + 1;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                result = mid;
                low = mid + 1;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int x = 2;

        int countNo = countOccurrences(arr, x);
        System.out.println("The number of occurrences of " + x + " is: " + countNo);
    }
}