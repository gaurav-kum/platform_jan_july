
// method overloading
// same function with diff no of parameters or diff type of para.
// if return type is diff. no matter.
// type and no. of parameter matters
class Calculator {
    public int add(int n1, int n2) {
        return n1+n2;
    }
    public int add(int n1, int n2, int n3) {
        return n1+n2+n3;
    }
    public double add(double n1, double n2, double n3) {
        return n1+n2+n3;
    }
}

public class demo3 {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int r1 = obj.add(2,3,5);
        System.out.println(r1);
    }
}
