
public class MaxNestingDepth {

    public static int maxDepth(String s) {
        int currentDepth = 0;
        int maxDepth = 0;

        // Traverse the string character by character
        for (char c : s.toCharArray()) {
            if (c == '(') {
                // Increment depth when encountering an opening parenthesis
                currentDepth++;
                // Update maxDepth if currentDepth is greater
                maxDepth = Math.max(maxDepth, currentDepth);
            } else if (c==')') {
                // Decrement depth when encountering a closing parenthesis
                currentDepth--;
            }
        }

        return maxDepth;
    }

    public static void main (String[] args) {
        String s1 = "((1+(2*3))+((8)/4))+1";
        System.out.println(maxDepth(s1)); 
    }
}