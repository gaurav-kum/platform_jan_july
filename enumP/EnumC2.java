package enumP;

enum Status2 {
    Running, Failed, Pending, Success;
}

public class EnumC2 {
    public static void main(String[] args) {
        Status2 s2 = Status2.Pending;

//        switch looks good than if-else becoz we aree working with constants
        switch (s2) {
            case Running :
                System.out.println("all good");
                break;
            case Failed :
                System.out.println("try again");
                break;
            default :
                System.out.println("done");
                break;
        }

        if(s2 == Status2.Running)
            System.out.println("all good");
        else if(s2 == Status2.Failed)
            System.out.println("Try again");
        else
            System.out.println("done");
    }
}
