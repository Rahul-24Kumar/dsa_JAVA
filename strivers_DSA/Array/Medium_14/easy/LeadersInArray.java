
class LeadersInArray {

    public static void findLeaders(int[] nums) {
        int n = nums.length;

        int maxFromRight = nums[n-1];
        System.out.print(maxFromRight + " ");

        for(int i = n-2; i >= 0; i--) {
            if(nums[i] >= maxFromRight) {
                maxFromRight = nums[i];
                System.out.print(maxFromRight + " ");
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {16, 17, 4, 3, 5, 2};

        findLeaders(nums);
    }
}