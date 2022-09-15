package Ss7_Abstract_Class_and_Interface.Exercise.Colorable_for_layers;

public class Rectangle extends Geometry{
    private double longs;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double longs, double width) {
        this.longs = longs;
        this.width = width;
    }

    public double getLongs() {
        return longs;
    }

    public void setLongs(double longs) {
        this.longs = longs;
    }

    public double getWith() {
        return width;
    }

    public void setWith(double with) {
        this.width = with;
    }


    @Override
    double getArea() {
        return this.longs*this.width;
    }
}
