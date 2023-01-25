package FinalK;

// if class is final, no one able to inherit it.
final class Calc {
    public void show() {
        System.out.println("in calc show");
    }
//    method final means no one can override it.
    public final void add(int a, int b) {
        System.out.println(a+b);
    }
}

public class FinalKey {
    public static void main(String[] args) {
//        cant change value of a final variable
//        final int num = 8
        Calc obj1 = new Calc();
        obj1.show();
        obj1.add(4,5);
    }
}
