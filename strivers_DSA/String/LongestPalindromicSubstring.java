public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        if (s == null || s.length()==0) return "";

        // Transform the original string to add boundaries
        StringBuilder t = new StringBuilder();

        for (char c : s.toCharArray()) {
            t.append("#").append(c);
        }

        t.append("#");
        String Transformed = t.toString();

        int n = Transformed.length();
        int[] P = new int[n];

        int c = 0, R = 0;   // c is the center, R is the right edge of the rightmost palindrome

        int maxLength = 0, centerIndex = 0;

        for (int i = 0; i < n; i++) {
            int mirror = 2*c -1;    // Mirror of i around center c

            if (i<R) {
                P[i] = Math.min(R-i, P[mirror]);    // Use previously calculated results
            }

            // Attempt to expand the palindrome centered at i
            while(i + P[i] + 1 < n && i - P[i] - 1 >=0 && 
                   Transformed.charAt(i + P[i] + 1) == Transformed.charAt(i-P[i] - 1)) {
                    P[i]++;
                   }

                   // If the palindrome expanded past R, adjust center c and R
                   if (i+P[i] > R) {
                    c = i;
                    R = i + P[i];
                   }

                   // Track the maximum length and the center of that palindrome
                   if(P[i] > maxLength) {
                    maxLength = P[i];
                    centerIndex = i;
                   }
        }

        // The start index of the longest palindrome in the original string
        int start = (centerIndex - maxLength)/2;
        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));

        s = "cbbd";
        System.out.println(longestPalindrome(s));
    }
}