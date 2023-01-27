package innerP;

class A3 {
    public void show() {
        System.out.println("in  A show");
    }
}
public class AnnoInnerC {
    public static void main(String[] args) {
        A3 obj = new A3() {
//            providing new implementation
            public void show() {
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}
