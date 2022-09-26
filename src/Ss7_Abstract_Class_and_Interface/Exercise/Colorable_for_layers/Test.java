package Ss7_Abstract_Class_and_Interface.Exercise.Colorable_for_layers;

public class Test {
    public static void main(String[] args) {
        Geometry circle = new Circle(1);
        Geometry circle1 = new Circle(2);

        Geometry square = new Square(4);
        Geometry square1 = new Square(3);

        Geometry rectangle = new Rectangle(4,2);
        Geometry rectangle1 = new Rectangle(6,4);

        Geometry[] geometrie = new Geometry[]{circle,square,rectangle,circle1,square1,rectangle1};
        for (Geometry geometry:geometrie) {
            if(geometry instanceof Colorable){
                ((Square) geometry).howToColor();
            }else {
                System.out.println(geometry.getArea());
            }
        }
    }
}
