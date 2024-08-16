public class ReverseWords {
    public static String reverseString(String s) {
        //  Convert the string to a character array
        char[] chars = s.toCharArray();
        int n = chars.length;

        //  Step 1: Reverse the entire string
        reverse(chars, 0, n-1);

        //  Step 2: Reverse each words in the reversed string
        int start = 0;
        for (int end = 0; end < n; end++) {
            if(chars[end] == ' ') {
                reverse(chars, start, end-1);
                start = end + 1;
            }
        }

        // Reverse the last word
        reverse(chars, start, n-1);

        // Return the result as a string
        return new String(chars);
    }

    // Helper function to reverse a portion of the array
    private static void reverse(char[] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        String input = "Hello I'm Rahul";

        String result = reverseString(input);

        System.out.println("Reversed: " + result);  
    }
}