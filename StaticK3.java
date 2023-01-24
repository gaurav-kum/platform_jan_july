
class Mobile3 {
    String brand;
    int price;
    static String name;
    Mobile3() {
        brand = "";
        price = 200;
//        System.out.println("in constructor");
    }
    static {
        name = "phone";
//        System.out.println("in static block");
    }
//    instance methods
    public void show() {
        System.out.println(brand + " " + price + " " + name);
    }
//    static methods
    public static void show1(Mobile3 obj) {
        System.out.println(obj.brand + " " + obj.price + " " + obj.name);
    }
}
public class StaticK3 {
    public static void main(String[] args) {
        Mobile3 obj1 = new Mobile3();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile3.name = "Iphone 13";

        Mobile3 obj2 = new Mobile3();
        obj2.brand = "Samsung";
        obj2.price = 800;
        Mobile3.name = "Galaxy J15";

        Mobile3.name = "phone";
        obj1.show();
        obj2.show();

        Mobile3.show1(obj1);




    }
}
