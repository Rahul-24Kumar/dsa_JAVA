import java.util.Arrays;

class Anagram {
    public static void main(String [] args) {
        String str1 = "Race";
        String str2 = "Care";

        // Convert both strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Check if lengths are different
        if (str1.length() != str2.length()) {
            System.out.println("It is not an Anagram");
            return;
        }

        // Convert strings to char arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted char arrays
        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println("It is an Anagram");
        } else {
            System.out.println("It is not an Anagram");
        }
    }
}
