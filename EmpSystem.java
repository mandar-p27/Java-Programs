import java.util.Scanner;

public class EmpData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int emp_number, phone_number;
        String name, address, designation;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter details for Employee " + i + ":");

            System.out.println("Emp_number:");
            emp_number = sc.nextInt();
            sc.nextLine(); // Consume newline after nextInt()

            System.out.println("Name:");
            name = sc.nextLine();

            System.out.println("Address:");
            address = sc.nextLine();

            System.out.println("Phone:");
            phone_number = sc.nextInt();
            sc.nextLine(); // Consume newline after nextInt()

            System.out.println("Designation:");
            designation = sc.nextLine();

            System.out.println("\nEmployee " + i + " Details:");
            System.out.println("Employee_Number:" + emp_number);
            System.out.println("Name:" + name);
            System.out.println("Address:" + address);
            System.out.println("Phone:" + phone_number);
            System.out.println("Designation:" + designation);
            System.out.println("--------------------------------------");
        }
    }
}