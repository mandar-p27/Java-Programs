import java.util.Scanner;

public class Swapusingvar {
    public static void main(String[] args) {
        int a , b , c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for a:");
        a = sc.nextInt();
        System.out.println("Enter value for b:");
        b = sc.nextInt();

        System.out.println("Values before being swapped");
        System.out.println("Value of a:"+a);
        System.out.println("Value of b:"+b);

        //Swapping using 3rd variable
        c = a;
        a = b;
        b = c;
        
        System.out.println();
        System.out.println("Values after being swapped");
        System.out.println("Value of a:"+a);
        System.out.println("Value of b:"+b);


    }
}