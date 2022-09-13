package ss6_Inheritance.Exercise.class_circle_and_class_cylinder;

public class Circle {
    private String color = "green";
    private double radius = 2.0;

    public Circle() {
    }

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }

    @Override
    public String toString() {
        return "color='" + color + '\'' +
                ", radius=" + radius
                ;
    }
}
