package AbstractP;

abstract class Car {
//    currently not know what to implement
    public abstract void drive();
    public void playMusic() {
        System.out.println("play music");
    }
}
// concrete class
class WagonR extends Car {
    public void drive() {
        System.out.println("driving...");
    }
}
public class AbstrC {
    public static void main(String[] args) {
        Car obj1 = new WagonR();
        obj1.drive();
        obj1.playMusic();
    }
}
