import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the input number is an Armstrong number
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        
        // Close the scanner
        scanner.close();
    }

    public static boolean isArmstrong(int number) {
        // Find the number of digits
        int numberOfDigits = 0;
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            numberOfDigits++;
        }

        // Calculate the sum of digits each raised to the power of numberOfDigits
        int sum = 0;
        temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numberOfDigits);
            temp /= 10;
        }

        // Check if the sum is equal to the original number
        return sum == number;
    }
}
