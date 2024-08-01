// TC = n

public class SimpleRotationCount {
    public static int RotationCount(int[] arr) {

        int minIndex = 0;

        for (int i = 1; i<arr.length; i++) {
            if(arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main (String[] args) {
        int[] arr = {5, 6, 7, 2, 3, 4};

        int countRotation = RotationCount(arr);
        System.out.println(countRotation);
    }
}