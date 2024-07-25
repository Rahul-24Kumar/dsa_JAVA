public class upperBound {
    public static int upperBound(int[] arr, int x) {
        int low = 0;
        int high = arr.length;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] <= x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9, 15, 19};
        int x = 9;
        
        int ind = upperBound(arr, x);
        System.out.println("The upper bound is at index: " + ind);
    }
}
