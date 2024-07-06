import java.io.*;

public class recursivePalindrome {

    public static boolean isPalindrome (int i, String s) {
        
        if(i >= s.length()/2) {
            return true;
        }

      if(s.charAt(i) != s.charAt(s.length()-i-1))
      return false;

      return isPalindrome (i+1, s);

    }

      public static void main(String [] args) {
        String s = "madam";

       boolean check = isPalindrome(0, s);

        if(check == true) {
            System.out.println("It is a palindrome!");
        } else {
            System.out.println("It is not a palindrome!");
        }
      
    }
}