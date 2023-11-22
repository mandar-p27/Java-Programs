import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int number = sc.nextInt();
        sc.close();

        int original_num , remainder , result = 0;
        original_num = number;

        while(original_num != 0 ) {
            remainder  = original_num % 10;
            result += Math.pow(remainder,3);
            original_num /= 10;
        }

        if(number == result) {
            System.out.println("The number " + number + " is a Armstrong Number");
        }
        else {
            System.out.println("The number " + number + " is not a Armstrong Number");
        }
    }
}