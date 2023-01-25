package CalcPack;
//Inheritance
// Single Inheritance
class AdvCalcu extends Calcu {
    public int multi(int n1, int n2) {
        return n1*n2;
    }
    public int div(int n1, int n2) {
        return n1/n2;
    }
}

// Multi level Inheritance
class VeryAdvCalcu extends AdvCalcu{
    public double power(int n1, int n2) {
        return Math.pow(n1,n2);
    }
}
public class Inher1 {
    public static void main(String[] args) {
        VeryAdvCalcu obj1 = new VeryAdvCalcu();
        int r1 = obj1.add(4,6);
        int r2 = obj1.sub(7,3);
        int r3 = obj1.multi(7,3);
        int r4 = obj1.div(7,3);
        double r5 = obj1.power(4,2);

        System.out.println(r1 + " " + r2);
        System.out.println(r3 + " " + r4);
        System.out.println(r5);
    }
}

// Java doesnt support multiple inheritance