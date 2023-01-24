//This and super keyword

class A2 {
    public A2() {
        System.out.println("in A");
    }
    public A2(int n) {
        System.out.println("in A int");
    }
}
class B2 extends A2 {
    public B2() {
        System.out.println("in B");
    }
    public B2(int n) {
//        execute the constructor of same class
        this();
        System.out.println("in B int");
    }
}

public class ThiSup2 {
    public static void main(String[] args) {
        B2 obj1 = new B2(10);
    }
}
