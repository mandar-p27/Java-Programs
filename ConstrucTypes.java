public class House{
    private int rooms;
    private String colour;

    //Default Constructor
    public House() { }

    //Parameterized Constructor
    public House(int rooms,String colour) {
        this.rooms = rooms;
        this.colour = colour;
    }

    //Setting default colour
    public House(int rooms) {
        this.rooms = rooms;
        this.colour = "Blue";
    }
    //Copy Constructor
    public House(House otherhouse) {
        this.rooms = otherhouse.rooms;
        this.colour = otherhouse.colour;
    }

    public void display(String house_type) {
        System.out.println(house_type+ " Details:");
        System.out.println("Number of rooms:"+rooms);
        System.out.println("Colour:"+colour);
        System.out.println();
    }

    public static void main(String[] args) {
        House default_house = new House();
        default_house.display("Default House");

        House customized_house = new House(4,"Cyan");
        customized_house.display("Customized House");

        House parameterised_house = new House(2);
        parameterised_house.display("Parameterized House");

        House copied_house = new House(customized_house);
        copied_house.display("Copied House");
    }
}