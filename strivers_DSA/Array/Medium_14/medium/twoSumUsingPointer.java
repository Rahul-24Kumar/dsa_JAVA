import java.util.Arrays;

// tc: O(nlogn), due to sorting else O(n)
// sc: O(1)

class twoSumUsingPointer {

    public static int[] twoSumArr (int[] arr, int targetSum) {

        Arrays.sort(arr);

        int left =0;
        int right = arr.length-1;

        while(left<right){
            int sum = arr[left] + arr[right];

            if(sum == targetSum) {
                return new int[]{arr[left], arr[right]};

            } else if (sum < targetSum) {
                left++;
            } else {
                 right--;
            }
        }

        return null;
    }

    public static void main (String[] args) {
        int[] arr = {2,6,5,8,11};
       int targetSum = 14;

       int[] result = twoSumArr(arr, targetSum);

       if(result == null) {
        System.out.println("No pair exist!");
       } else {
        System.out.println(Arrays.toString(result));
       }


    }
}