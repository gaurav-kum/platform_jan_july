

class Kid {
    int rollno;
    String name;
    int marks;
}

public class Student1 {
    public static void main(String[] args) {
        Kid s1 = new Kid();
        s1.rollno = 1;
        s1.name = "Naveen";
        s1.marks = 88;

        Kid s2 = new Kid();
        s2.rollno = 2;
        s2.name = "Gaurav";
        s2.marks = 80;

        Kid s3 = new Kid();
        s3.rollno = 3;
        s3.name = "Rahul";
        s3.marks = 70;

//        creating arrays of kids
        Kid kids[] = new Kid[3];
        kids[0] = s1;
        kids[1] = s2;
        kids[2] = s3;

        for(int i=0;i<kids.length;i++){
            System.out.println(kids[i].name + " : " + kids[i].marks);
        }

    }
}
