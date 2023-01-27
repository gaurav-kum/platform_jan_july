package enumP;

enum Status {
//    named constants
    Running, Failed, Pending, Success;
}
public class EnumC {
    public static void main(String[] args) {
        Status s = Status.Success;
        System.out.println(s);
        System.out.println();

        Status[] ss = Status.values();
        for(Status s1 : ss) {
            System.out.println(s1 + " " + s1.ordinal());
        }
    }
}
