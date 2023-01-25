class Calc {
    int a;
    public int add(int n1, int n2){
        int res = n1+n2;
        return res;
    }
}

public class Demo {
    public static void main(String[] args) {
//        object creation
        int num1 = 4;
        int num2 = 5;
        Calc calc = new Calc();

        int result = calc.add(num1,num2);
        System.out.println(result);
    }
}