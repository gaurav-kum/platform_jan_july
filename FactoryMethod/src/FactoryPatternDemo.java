
//Use the Factory to get object of concrete class by passing an
// information such as type.
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();

//        get an object of Circle and call its draw method.
        Shape s1 = sf.getShape("Circle");
//        call draw method
        s1.draw();

        Shape s2 = sf.getShape("Rectangle");
        s2.draw();
    }
}
