import java.util.ArrayList;
import java.util.List;

public class MajorityElementNBy3 {

    public static List<Integer> findMajorityElements(int[] nums) {
        int n = nums.length;
        int candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;

        // Phase 1: Find potential candidates

        for(int num : nums) {
            if(num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        // Phase 2: Validate the candidates

        count1 = 0;
        count2 = 0;

        for(int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }

        List <Integer> result = new ArrayList<>();
        if(count1 > n / 3) {
            result.add(candidate1);
        }

        if (count2 > n / 3) {
            result.add(candidate2);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 4, 2, 2, 2, 3};
        
        List<Integer> majorityElements = findMajorityElements(nums);

        System.out.println("Majority elements:" + majorityElements);
    }
}