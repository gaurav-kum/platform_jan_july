package InterfacP;

//we dont instantiate interface
interface A {
// variables by default static and final
    int age = 44;
    String area = "Mumbai";
//    all methods by default public abstract
    void show();
    void config();
}
//implements refers that A is interface not class
class B implements A {
    public void show() {
        System.out.println("in show");
    }
    public void config() {
        System.out.println("in config");
    }
}

public class InterfacC1 {
    public static void main(String[] args) {
        A obj = new B();
        obj.config();
        obj.show();

        System.out.println(A.area);
    }
}
