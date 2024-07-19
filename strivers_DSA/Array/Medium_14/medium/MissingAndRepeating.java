import java.util.*;

public class MissingAndRepeating {
    public static int[] findMissingAndRepeating(int[] nums) {
        int n = nums.length;
        int sumN = n * (n + 1) / 2;
        int sumN2 = n * (n + 1) * (2 * n + 1) / 6;
        int sumNums = 0;
        int sumNums2 = 0;

        for (int num : nums) {
            sumNums += num;
            sumNums2 += num * num;
        }

        int diff = sumN - sumNums; // missing - repeating
        int sumDiff = (sumN2 - sumNums2) / diff; // missing^2 - repeating^2

        int missing = (diff + sumDiff) / 2;
        int repeating = sumDiff - missing;

        return new int[]{repeating, missing};
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 6, 2, 1, 1};
        int[] result = findMissingAndRepeating(nums);

        System.out.println("Repeating number: " + result[0]);
        System.out.println("Missing number: " + result[1]);
    }
}
