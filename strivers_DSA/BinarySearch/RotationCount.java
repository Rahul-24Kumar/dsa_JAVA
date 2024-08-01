
public class RotationCount {
    public static int RotationCount (int[] arr) {
        int left = 0;
        int right = arr.length -1;
   

        while (left < right) {
            
            int mid = left + (right - left)/2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }


    public static void main (String[] args) {
        int[] arr = {4, 5, 6, 7, 2, 3};

        int countRotation = RotationCount(arr);
        System.out.println(countRotation);
    }
}