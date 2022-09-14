package Ss7_Abstract_Class_and_Interface.Exercise.Implement_interfaces_for_classes;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        Rectangle rectangle = new Rectangle(4,2);
        Square square = new Square(4);

        System.out.println(circle.area());
        System.out.println(rectangle.area());
        System.out.println(square.area());
        
        circle.resize(50);
        System.out.println(circle.area());
        rectangle.resize(50);
        System.out.println(rectangle.area());
        square.resize(50);
        System.out.println(square.area());

        Resizeable[] resizeable = new Resizeable[]{circle,rectangle,square};
        for (Resizeable resizeable1: resizeable) {
            System.out.print(resizeable1.area()+",");
        }
    }
}
