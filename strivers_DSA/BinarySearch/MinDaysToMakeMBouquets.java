
public class MinDaysToMakeMBouquets {
    public static int minDays(int[] bloomDay, int m, int k) {
        // If it's impossible to make M bouquets
        if(bloomDay.length < m*k) {
            return -1;
        }

        // Find the minimum and maximum days in bloomDay
        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;

        for(int day : bloomDay) {
            minDay = Math.min(minDay, day);
            maxDay = Math.max(maxDay, day);
        }

        // Perform binary search
        while (minDay < maxDay) {
            int midDay = (minDay + maxDay) / 2;
            if (canMakeBouquets(bloomDay, midDay, m, k)) {
                maxDay = midDay;    // Try to find a smaller day
            } else {
                minDay = midDay + 1;    // Increase the day
            }
        }
        return minDay;
    }

    public static boolean canMakeBouquets (int[] bloomDay, int day, int m, int k) {
        int bouquets = 0;
        int flowers = 0;

        for (int bloom : bloomDay) {
            if (bloom <= day) {
                flowers++;
                if(flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;    // Reset if a flower hasn't bloomed
            }
            if (bouquets >= m) {
                return true;
            }
        }

        return false;
    }

    public static void main (String[] args) {
        int[] bloomDay = {1, 10, 3, 10, 2};
        int m = 3;
        int k = 1;
        int result = minDays(bloomDay, m, k);
        System.out.println("Minimum Days:" + result);
    }
}