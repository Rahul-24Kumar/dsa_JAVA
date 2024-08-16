
public class RemoveOutermostParentheses{

    public static String removeParentheses (String s) {
        char[] result = new char[s.length()];
        int balance = 0;
        int index = 0;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '('){
                //  If balance is greater than 0, it's not an outermost '('

                if (balance > 0) {
                    result[index++] = c;
                }
                balance++;
            } else {
                balance--;
                //  If balance is greater than 0 after decrement, it's not an outermost
                if (balance > 0) {
                    result[index++] = c;
                }
            }
        }

        // Return the final result as a string with the correct length
        return new String(result, 0, index);
    }

    public static void main(String[] args) {
        String input = "(()())(())";
        String result = removeParentheses(input);
        System.out.println(result);
    }
}