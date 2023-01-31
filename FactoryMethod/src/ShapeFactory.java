
//Create a Factory to generate object of concrete class based on
// given information.
public class ShapeFactory {
//    method that return Shape object
    public Shape getShape(String shapeType) {
        if (shapeType == null)
            return null;
//        equalsIgnoreCase used to compare 2 strings
        if(shapeType.equalsIgnoreCase("CIRCLE")){
//            calling Circle's constructor
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}
