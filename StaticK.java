
class Mobile {
//    instance variables
    String brand;
    int price;
//    static variable is shared by all the objects
    static String name;
    public void show() {
//        variable inside a method is local variable
        System.out.println(brand + " " + price + " " + name);
    }
}
public class StaticK {
    public static void main(String[] args) {
         Mobile obj1 = new Mobile();
         obj1.brand = "Apple";
         obj1.price = 1500;
         Mobile.name = "Iphone 13";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 800;
        Mobile.name = "Galaxy J15";

//        motorola is common to all object name
        Mobile.name = "Motorola";

        obj1.show();
        obj2.show();
    }
}
