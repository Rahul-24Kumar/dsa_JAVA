public class NthRootFinder {

    // Checks if mid^n is equal to, less than, or greater than m
    public static int checkPower(int mid, int n, int m) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= mid;
            if (result > m) return 2; // Mid^n is greater than m
        }
        if (result == m) return 1; // Mid^n equals m
        return 0; // Mid^n is less than m
    }

    public static int findNthRoot(int n, int m) {
        int low = 1, high = m;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int powerCheck = checkPower(mid, n, m);

            if (powerCheck == 1) {
                return mid; // Exact Nth root found
            } else if (powerCheck == 0) {
                low = mid + 1; // Look in the higher range
            } else {
                high = mid - 1; // Look in the lower range
            }
        }

        return -1; // No integer Nth root found
    }

    public static void main(String[] args) {
        int n = 4, m = 16;
        int result = findNthRoot(n, m);
        System.out.println("The " + n + "th root of " + m + " is: " + result);
    }
}
