package Ss7_Abstract_Class_and_Interface.Exercise.Colorable_for_layers;

public class Square extends Geometry implements Colorable{
    private double edge;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    double getArea() {
        return Math.pow(this.edge,2);
    }
}
