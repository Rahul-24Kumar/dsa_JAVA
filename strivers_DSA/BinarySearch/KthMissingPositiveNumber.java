// O(n + k) time complexity

public class KthMissingPositiveNumber {
    public static int findKthMissing(int[]  arr, int k) {
        int missingCount = 0;
        int currentNum = 1;
        int index = 0;

        while (missingCount < k) {
            //  If currentNum is not in arr, it's a missing number
            if(index < arr.length && arr[index] == currentNum) {
                index++;
            } else {
                missingCount++;
            }
            if (missingCount < k) {
                currentNum++;
            }
        }

        return currentNum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        int result = findKthMissing(arr, k);
        System.out.println("The " + k + "th missing positive number is: " + result);
    }
}