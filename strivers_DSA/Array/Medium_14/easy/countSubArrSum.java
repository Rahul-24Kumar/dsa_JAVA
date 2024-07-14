import java.util.HashMap;

class countSubArrSum {

    public static int countSubArrSumK(int[] nums, int k) {

        HashMap <Integer, Integer> sumMap = new HashMap <>();

        sumMap.put(0, 1);

        int count = 0;
        int sum = 0;

        for(int num: nums) {
            sum +=num;

            if(sumMap.containsKey(sum -k)) {
                count += sumMap.get(sum-k);
            }

            sumMap.put(sum, sumMap.getOrDefault(sum, 0) + 1);
        }

        return count;
    } 

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;
        System.out.println(countSubArrSumK(nums, k));
    }
}