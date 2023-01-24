
class Mobile2 {
    //    instance variables
    String brand;
    int price;
    static String name;
// constructor
    Mobile2() {
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }
//    static block
    static {
        name = "phone";
        System.out.println("in static block");
    }
    public void show() {
//        variable inside a method is local variable
        System.out.println(brand + " " + price + " " + name);
    }
}
public class StaticK2 {
    public static void main(String[] args) {
        Mobile2 obj1 = new Mobile2();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile2.name = "Iphone 13";

        Mobile2 obj2 = new Mobile2();

//        it loads your class
//        Class.forName("Mobile");

    }
}
