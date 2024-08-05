import java.util.*;

public class KokoEatingBananas {
    public static int minEatingSpeed(int[] piles, int H) {
        int left = 1;
        int right = 0;

        //  Find the max number of bananas in a single pile
        for (int pile: piles) {
            right = Math.max(right, pile);
        }

        while(left < right) {
            int mid = left + (right-left)/2;
            int hours = 0;

            //  Calculate the total hours needed at the current speed
            for(int pile : piles) {
                hours +=(pile + mid - 1)/mid;   // This is a simplified way of doing ceil (pile/mid)
            }

            // If Koko can eat all bananas within H hours, try a smaller speed
            if (hours <= H) {
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] piles = {7, 15, 6, 3};
        int H = 8;

        int result = minEatingSpeed(piles, H);
        System.out.println(result);
    }
    
}