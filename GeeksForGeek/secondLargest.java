import java.util.List;
import java.util.Arrays;

class secondLargest {
    public static int print2largest(List<Integer> arr) {
        if (arr.size() < 2) {
            return -1;
        }
        
        int max = Integer.MIN_VALUE;
        int prevMax = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.size(); i++) {
            int current = arr.get(i);
            if (current > max) {
                prevMax = max;
                max = current;
            } else if (current > prevMax && current != max) {
                prevMax = current;
            }
        }
        
        if (prevMax == Integer.MIN_VALUE) {
            return -1;
        }
        
        return prevMax;
    }

    public static void main(String[] args) {
        
        List<Integer> arr1 = Arrays.asList(12, 35, 1, 10, 34, 1);
        List<Integer> arr2 = Arrays.asList(10, 10);
        
        System.out.println(print2largest(arr1)); // Expected Output: 34
        System.out.println(print2largest(arr2)); // Expected Output: -1
    }
}
