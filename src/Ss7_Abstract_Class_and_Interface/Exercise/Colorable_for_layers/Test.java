package Ss7_Abstract_Class_and_Interface.Exercise.Colorable_for_layers;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(4,2);

        Geometry[] geometrie = new Geometry[]{circle,square,rectangle};
        for (Geometry geometry:geometrie) {
            if(geometry.equals(square)){
                square.howToColor();
            }else {
                System.out.println(geometry.getArea());
            }
        }
    }
}
