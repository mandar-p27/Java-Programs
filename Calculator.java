import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a, b, addition, subtraction, multiplication, Operation;
        double division;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first value:");
        a = sc.nextInt();
        System.out.println("Enter second value:");
        b = sc.nextInt();

        System.out.println("Hola Amigos!!!");
        System.out.println("Select the Operation that you want to perform:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        Operation = sc.nextInt();

        switch (Operation) {
            case 1:
                addition = a + b;
                System.out.println("The addition of " + a + " and " + b + " is: " + addition);
                break;
            case 2:
                subtraction = a - b;
                System.out.println("The subtraction of " + a + " and " + b + " is: " + subtraction);
                break;
            case 3:
                multiplication = a * b;
                System.out.println("The multiplication of " + a + " and " + b + " is: " + multiplication);
                break;
            case 4:
                if (b != 0) {
                    division = (double) a / b;
                    System.out.println("The division of " + a + " and " + b + " is: " + division);
                } else {
                    System.out.println("Error: Division by zero cannot be done.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }

        sc.close();
    }
}
