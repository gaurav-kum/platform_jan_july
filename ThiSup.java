//This and super keyword

class A {
    public A() {
        System.out.println("in A");
    }
    public A(int n) {
        System.out.println("in A int");
    }
}
class B extends A {
    public B() {
        System.out.println("in B");
    }
    public B(int n) {
        super(n);
        System.out.println("in B int");
    }
}

public class ThiSup {
    public static void main(String[] args) {
        B obj1 = new B(10);
    }
}
