package Company;

class Employee {
    private String name; // Private(Access restricted within the class)
    protected int employee_id; // Protected(Access within the package and subclasses)
    int salary; // Default(Access within same package)
    public String department; // Public (Access anywhere)

    public Employee(String name, int employee_id, int salary, String department) {
        this.name = name;
        this.employee_id = employee_id;
        this.salary = salary;
        this.department = department;
    }

    public void display_emp_details() {
        System.out.println("Employee Name:"+name);
        System.out.println("Employee ID:"+employee_id);
        System.out.println("Salary:"+salary);
        System.out.println("Department:"+department);
    }
}

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee("MP", 007, 6400000, "Quant Research");

        System.out.println("Employee Details:");
        // Trying to access private field 'name' directly results in a compilation error
        /* This line will cause a compilation error
        System.out.println("Name: " + employee1.name);
         */
        System.out.println("Employee_ID:" +employee1.employee_id);
        System.out.println("Salary: " + employee1.salary);
        System.out.println("Department: " + employee1.department);
    }
}