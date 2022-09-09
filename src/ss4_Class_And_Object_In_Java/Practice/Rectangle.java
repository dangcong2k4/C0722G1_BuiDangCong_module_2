package ss4_Class_And_Object_In_Java.Practice;

public class Rectangle {
    double width, height;
    public Rectangle(){
    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public String display() {
        return "hình chữ nhật {" + "width=" + width + ", height=" + height + '}';
    }
    public double getPerimeter(){
        return (this.width+this.height)*2;
    }
    public double getArea(){
        return this.width*this.height;
    }
}
