import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int input_num = sc.nextInt();
        int original_num = input_num;

        int reversed_num = 0;

        while(input_num != 0) {
            int last_digit = input_num % 10;
            reversed_num = reversed_num * 10 + last_digit;
            input_num = input_num / 10;
        }

        if(original_num == reversed_num) {
            System.out.println("The number " + original_num + " is a palindrome");
        } else {
            System.out.println("The number " + original_num + " is not a palindrome");
        }
    }
}