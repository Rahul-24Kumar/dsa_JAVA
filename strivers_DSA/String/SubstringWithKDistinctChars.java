import java.net.SocketPermission;
import java.util.HashMap;

public class SubstringWithKDistinctChars {

    public static int countSubsWithKDistinct(String s, int k) {
        if (k == 0 || s.length() == 0)
            return 0;
        return countSubsWithAtMostKDistinct(s, k) - countSubsWithKDistinct(s, k - 1);
    }

    private static int countSubsWithAtMostKDistinct(String s, int k) {
        int n = s.length();
        if (k == 0)
            return 0;

        HashMap<Character, Integer> freqMap = new HashMap<>();
        int left = 0, right = 0, count = 0, distinctCount = 0;

        while (right < n) {
            // Expand the window by including the char at right
            char rightChar = s.charAt(right);

            freqMap.put(rightChar, freqMap.getOrDefault(rightChar, 0) + 1);
            if (freqMap.get(rightChar) == 1) {
                distinctCount++;
            }

            // Contract the window until it has at most k distinct char
            while (distinctCount > k) {
                char leftChar = s.charAt(left);
                freqMap.put(leftChar, freqMap.get(leftChar) - 1);
                if (freqMap.get(leftChar) == 0) {
                    distinctCount--;
                }
                left++;
            }

            // count substring with at most k distinct char
            count += right - left + 1;

            // Move right pointer forward
            right++;
        }

        return count;
    }

    public static void main(String[] args) {
        String s1 = "aba";
        int k1 = 2;
        System.out.println(countSubsWithKDistinct(s1, k1));

        String s2 = "abaaca";
        int k2 = 1;

        System.out.println(countSubsWithKDistinct(s2, k2));
    }
}
