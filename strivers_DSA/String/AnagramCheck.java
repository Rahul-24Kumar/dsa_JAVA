import java.util.HashMap;

public class AnagramCheck {
    public static boolean areAnagrams(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Integer>charCount= new HashMap<>();

        // Increment the count for s1 and decrement for s2

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            charCount.put(c1, charCount.getOrDefault(c1, 0) + 1);
            charCount.put(c2, charCount.getOrDefault(c2, 0) - 1);
        }

        // Check if all counts are zero
        for(int count : charCount.values()) {
            if (count !=0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        System.out.println(areAnagrams(s1, s2));
    }
}