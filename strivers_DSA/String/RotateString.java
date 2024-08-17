public class RotateString {

    public static boolean comomonChar(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }
        // Concate s with itself
        String doubleS = s + goal;


        // Check if goal is a substring of concatenated string
        return doubleS.contains(goal);

    }

    public static void main (String[] args) {
        String s1 = "abcde";
        String goal1 = "cdeab";
        System.out.println(comomonChar(s1, goal1));
    }
}