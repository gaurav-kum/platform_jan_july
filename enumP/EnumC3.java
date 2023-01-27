package enumP;

enum Laptop {
//    they are treated as objects
    Macbook(2000), XPS(2200), Surface, ThinkPad(1800);

//    for surface (as no parameter)
    private Laptop() {
        price = 500;
    }
    private int price;
//    parameterized constructor
//    objects in same class, that's why private constructor
    private Laptop(int price) {
        this.price = price;
//        this.name is not working
//        System.out.println(this.name + "in laptop");
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumC3 {
    public static void main(String[] args) {
        Laptop lap = Laptop.Macbook;

        System.out.println(lap.getClass().getSuperclass());
        System.out.println(lap + " " + lap.getPrice());

        for(Laptop laps : Laptop.values())
            System.out.println(laps + " " + laps.getPrice());

    }
}
