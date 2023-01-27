package InterfacP;

interface Computer {
    void code();
}
class Laptop implements Computer {
    public void code() {
        System.out.println("code, compile, run");
    }
}
class Desktop implements Computer {
    public void code() {
        System.out.println("code, compile, run : faster");
    }
}
class Developer {
    public void devApp(Computer lap) {
        lap.code();
    }
}

public class InterfacC2 {
    public static void main(String[] args) {
//        creating reference of parent class & object of sub-class
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer naveen = new Developer();
        naveen.devApp(desk);
        naveen.devApp(lap);

    }
}
