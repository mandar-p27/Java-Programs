import java.util.Scanner;

public class checkeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check if its even or not:");
        int num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println("The number " + num + " is even ");
        }
        else {
            System.out.println("The number " + num + " is odd ");
        }


    }
}