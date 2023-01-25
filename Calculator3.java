// two different objects
class Domo1 {
    int num = 5;
    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

public class Calculator3 {
    public static void main(String[] args) {
        int data = 10;
        Domo1 obj = new Domo1();
        Domo1 obj1 = new Domo1();
        int r1 = obj.add(3,4);

        obj.num = 8;

        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
}
