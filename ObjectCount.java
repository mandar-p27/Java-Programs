class ObjectCreator {
    private static int object_counter = 0;

    public ObjectCreator() {
        object_counter++;
    }
    public static int getObjectCount() {
        return object_counter;
    }
}

public class ObjectCount {
    public static void main(String[] args) {
        ObjectCreator obj1 = new ObjectCreator();
        ObjectCreator obj2 = new ObjectCreator();
        ObjectCreator obj3 = new ObjectCreator();
        ObjectCreator obj4 = new ObjectCreator();

        System.out.println("Number of objects created:" +ObjectCreator.getObjectCount());
    }
}