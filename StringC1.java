//Mutable string : can change
// Immutable string : can't change  (by default)
// to use mutable string, use string buffer or string builder
public class StringC1 {
    public static void main(String[] args) {
        String name = "naveen";
        System.out.println("hello " + name);
        System.out.println(name.charAt(1));
        System.out.println(name.concat(" reddy"));
    }
}
