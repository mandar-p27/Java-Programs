import java.util.Scanner;

public class UpperorLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character:");
        char ch = sc.next().charAt(0);

        if(Character.isLowerCase(ch)) {
            System.out.println(ch + " is lowercase ");
        }
        else if(Character.isUpperCase(ch)) {
            System.out.println(ch + " is uppercase ");
        }
    }
}
