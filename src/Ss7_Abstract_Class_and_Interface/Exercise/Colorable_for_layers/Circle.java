package Ss7_Abstract_Class_and_Interface.Exercise.Colorable_for_layers;

public class Circle extends Geometry{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    double getArea() {
        return Math.pow(this.radius,2)*Math.PI;
    }
}
