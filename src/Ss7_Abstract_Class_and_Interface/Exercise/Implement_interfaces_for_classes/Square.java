package Ss7_Abstract_Class_and_Interface.Exercise.Implement_interfaces_for_classes;

public class Square implements Resizeable{
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
    public void resize(double percent) {
        this.edge = this.edge+this.edge*(percent/100);
    }

    @Override
    public double area() {
        return Math.pow(this.edge,2);
    }
}
