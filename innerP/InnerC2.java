package innerP;

class A2 {
    int age;
    public void show() {
        System.out.println("in show");
    }

    static class B2 {
        public  void config() {
            System.out.println("in config");
        }
    }
}
public class InnerC2 {
    public static void main(String[] args) {
        A2 obj1 = new A2();
        obj1.show();

//        static class doesnt require object
        A2.B2 obj2 = new A2.B2();
        obj2.config();
    }
}
