public class LargestOddNumber {
    
    public static String findLargestOddNumber(String numStr) {
        for (int i = numStr.length() - 1; i >= 0; i--) {
            char digit = numStr.charAt(i);
            if ((digit - '0') % 2 != 0) {
                return numStr.substring(0, i + 1);
            }
        }
        return ""; // Return empty string if no odd number is found
    }

    public static void main(String[] args) {
        String numStr = "4206357"; // Example string

        String largestOddNumber = findLargestOddNumber(numStr);
        System.out.println("The largest odd number is: " + largestOddNumber);
    }

}
