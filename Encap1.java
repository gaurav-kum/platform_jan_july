
class Human {
//    make instance variables private
     private int age;
     private String name;

     public Human() {
         age = 12;
         name = "John";
     }
//     parametrized constructor
    public Human(String name) {
         this.name = name;
    }
     public Human(int age, String name) {
         this.age = age;
         this.name = name;
     }
//     access them using methods ( getter and setter methods )
    public String getName() {
        return name;
    }
    public void setName(String name) {
//        this represents the current object
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

public class Encap1 {
    public static void main(String[] args) {
        Human obj1 = new Human();
        Human obj2 = new Human(18,"Gaurav");
        Human obj3 = new Human("Daksh");

        System.out.println(obj1.getName() + " " + obj1.getAge());
        System.out.println(obj2.getName() + " " + obj2.getAge());
        System.out.println(obj3.getName() + " " + obj3.getAge());
    }
}
