import java.util.HashMap;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();

        for (int i = 0; i<s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // Check if there is a mapping for c1 in mapS

            if (mapS.containsKey(c1)) {
                if(mapS.get(c1) != c2) {
                    return false;   // Mapped to different character in t
                }
            } else {
                mapS.put(c1, c2);
            }

            // Check if there is a mapping for c2 in mapT
            if(mapT.containsKey(c2)) {
                if(mapT.get(c2) != c1) {
                    return false;       // Mapped to different character in s
                }
            } else {
                mapT.put(c2, c1);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "egg";
        String t1 = "add";

        System.out.println("Isomorphic: " + isIsomorphic(s1, t1));
    }
}