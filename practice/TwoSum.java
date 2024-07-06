class TwoSum {
    public static void main(String [] args) {

        int[] nums = {7, 9, 5, 2, 8, 4};
       int target = 14;

       int[] result = SumOfTwoNumber(nums, target);

       if (result != null) {
        System.out.println("Two Numbers Indices are :"+ result[0]+ "," + result[1]);
       }
       else {
        System.out.println("Elements Not Found!");
       }         
    }

    public static int[] SumOfTwoNumber(int[] nums, int target) {
        for (int i = 0; i<nums.length; i++){
        for (int j = i+1; j<nums.length; j++){
            if (nums[i] + nums[j] == target){
                return new int[] {i, j};
            }
        }
       }
       return null;
       } 

    }
    