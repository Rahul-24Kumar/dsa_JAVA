import java.util.HashSet;
import java.util.Set;

class longConsecutiveArray {

    public static int longestConsecutiveArray (int[] arr) {

        if(arr.length ==0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();

        for(int num : arr) {
            set.add(num);
        }

        int longestStreak = 0;

        for(int num : set) {
            if(!set.contains(num-1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum+1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;

    }

    public static void main (String[] args) {
        int[] arr = {100, 200, 4, 2, 3, 7, 9, 8, 6};

        int result = longestConsecutiveArray(arr);
        System.out.println(result);
    }
}