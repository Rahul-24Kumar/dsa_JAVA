import java.util.*;

public class findAll_Divisor{
    public static void divisorOfNum(int number) {
        if(number < 1) {
            System.out.println("This number is invalid!");
            return;
        }

        for (int i = 1; i<= Math.sqrt(number); i++) {
            if(number % i == 0) {
                System.out.print(i + " ");

                if(i != number / i) {
                    System.out.print((number / i) + " ");
                }
            }
        }
       System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = scanner.nextInt();

        divisorOfNum(number);
    }
}



// import java.util.Scanner;
// public class findAll_Divisor{
//     public static void divisorOfNum (int number) {

//         int divideBy = 1;

//         if(number < 1) {
//             System.out.println("Invalid Number!");
//         }

//         while (divideBy <= number) {
//             if (number % divideBy == 0){
//                 System.out.print(divideBy + ",");
//             }
//             divideBy++;
//         }
//     }

//     public static void main(String [] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a Number:");
//         int number = scanner.nextInt();


//         divisorOfNum(number);
//     }
// }