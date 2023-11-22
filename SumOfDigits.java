import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int number = sc.nextInt();

        int original_number,result = 0,remainder = 0;
        original_number = number;

        while(original_number != 0) {
           remainder = original_number % 10;
           result += remainder;
           original_number /= 10;
        }

        System.out.println("The sum of the digits is " + result);
    }
}