package ss6_Inheritance.Exercise.class_circle_and_class_cylinder;

public class Cylinder extends Circle{
    private double height = 3.0;

    public Cylinder() {
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString()+
                ", height=" + height +
                ", volume="+ getVolume()+
                '}';
    }
}
