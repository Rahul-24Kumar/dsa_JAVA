public class ShippingCapacityCalculator {

    public static int shipWithinDays(int[] weights, int D) {
        int left = 0;
        int right = 0;

        //  Calculate the minimum and maximum capacity for binary search
        for(int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }

        //  Perform binary search to find the minimum capacity required
        while(left < right) {
            int mid = left + (right-left)/2;
            if(canShip(weights, D, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static boolean canShip(int[] weights, int D, int capacity) {
        int days = 1;
        int currentLoad = 0;

        for (int weight: weights) {
            if(currentLoad + weight > capacity) {
                days++;
                currentLoad = 0;
            }
            currentLoad += weight;
        }
        return days<=D;
    }

    public static void main(String[] args) {
        int[] weights = {5,4,5,2,3,4,5,6};
        int D = 5;
        
        // Get the minimum capacity required
        int result = shipWithinDays(weights, D);
        System.out.println("Minimum capacity to ship within " + D + " days: " + result);
    }
}