public class MethodTypes {
    private int instance_variable = 20;
    private static int static_variable = 10;

    // Instance method
    public void instanceMethod() {
        System.out.println("Inside Instance Method");
        System.out.println("Instance Variable:"+instance_variable);
        System.out.println();
    }

    // Static method
    public static void staticMethod() {
        System.out.println("Inside Static Method");
        System.out.println("Static Variable:"+static_variable);
        System.out.println();
    }

    // Getter method
    public int getInstance_Variable() {
        return instance_variable;
    }

    // Setter method
    public void setInstance_Variable(int new_value) {
        instance_variable = new_value;
    }

    // Void method
    public void voidMethod() {
        System.out.println("Inside void method");
        System.out.println();
    }

    // Return method
    public int returnMethod(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodTypes obj = new MethodTypes();

        // Instance method call
        obj.instanceMethod();

        // Static method call
        staticMethod();

        // Getter method usage
        int value = obj.getInstance_Variable();
        System.out.println("Value retrieved using getter: " + value);

        // Setter method usage
        obj.setInstance_Variable(30);
        System.out.println("New value set using setter: " + obj.getInstance_Variable());

        // Void method call
        obj.voidMethod();

        // Return method call
        int result = obj.returnMethod(5, 7);
        System.out.println("Result of return method: " + result);
    }
}