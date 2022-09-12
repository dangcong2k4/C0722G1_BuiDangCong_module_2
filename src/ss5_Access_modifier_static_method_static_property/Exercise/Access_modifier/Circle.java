package ss5_Access_modifier_static_method_static_property.Exercise.Access_modifier;

public class Circle {
    private double radius= 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI*Math.pow(getRadius(),2);
    }
}
