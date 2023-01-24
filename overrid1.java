// method Overriding

class A1 {
    public void show() {
        System.out.println("in A1 show");
    }
    public void config() {
        System.out.println("in A1 config");
    }
}
class B1 extends A1 {
//    method overriding
    public void show() {
        System.out.println("in B1 show");
    }
}

public class overrid1 {
    public static void main(String[] args) {
        B1 obj1 = new B1();
        obj1.show();
        obj1.config();
    }
}
