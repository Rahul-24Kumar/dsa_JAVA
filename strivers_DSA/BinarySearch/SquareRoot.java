public class SquareRoot {

    public static int findSquareRoot (int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }

        // Base cases

        if (n==0 || n==1) {
            return n;
        }

        // Implementing binary search

        int start = 1, end = n, ans = 0;

        while (start <= end) {
            int mid = start + (end - start)/2;

            // If mid*mid = n, return mid
            if(mid== n/mid) {
                return mid;
            }

            // Since we need floor, we update answer when mid*mid is smaller than n,
            // and move closer to sqrt(n)
            if (mid <= n/mid) {
                start = mid + 1;
                ans = mid;
            } else {    // If mid*mid is greater than n
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main (String[] args) {
        int n = 12;
        int result = findSquareRoot(n);
        System.out.println("The square root of " + n + " is: " + result);
    }
}