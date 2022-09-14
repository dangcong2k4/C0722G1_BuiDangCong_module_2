package Ss7_Abstract_Class_and_Interface.Exercise.Implement_interfaces_for_classes;

public class Rectangle implements Resizeable{
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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void resize(double percent) {
        this.longs = this.longs+this.longs*(percent/100);
        this.width = this.width+this.width*(percent/100);
    }

    @Override
    public double area() {
        return this.longs*this.width;
    }
}
