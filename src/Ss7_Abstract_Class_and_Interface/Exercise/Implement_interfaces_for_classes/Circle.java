package Ss7_Abstract_Class_and_Interface.Exercise.Implement_interfaces_for_classes;

public class Circle implements Resizeable{
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
    public void resize(double percent) {
        this.radius = this.radius + this.radius*(percent/100);

    }

    @Override
    public double area() {
        return Math.pow(this.radius,2)*Math.PI;
    }

}
