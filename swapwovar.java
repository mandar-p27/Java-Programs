import java.util.Scanner;

public class swapwovar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b;

        System.out.println("Enter the value for a:");
        a = sc.nextInt();
        System.out.println("Enter the value for b:");
        b = sc.nextInt();

        System.out.println("Values before being swapped");
        System.out.println("Value of a:"+a);
        System.out.println("Value of b:"+b);

        //Swapping without using 3rd variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println();
        System.out.println("Values after being swapped");
        System.out.println("Value of a:"+a);
        System.out.println("Value of b:"+b);
    }
}
