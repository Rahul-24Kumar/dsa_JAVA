import java.io.*;

class fibonacci {

    public static int fibonacciSum(int n) {
        if (n < 0) {
            System.out.println("Invalid number!");
            return -1;
        }

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int a = 0, b = 1;

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    public static void main(String[] args) {
        int sum = fibonacciSum(9);
        System.out.println(sum);  // Output should be 5 for F(5)
    }
}
