package ss4_Class_And_Object_In_Java.Exercise;

public class Exe3_Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed= SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color= "blue";

    public int getSLOW() {
        return SLOW;
    }
    public int getMEDIUM() {
        return MEDIUM;
    }
    public int getFAST() {
        return FAST;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if(this.on == true ){
            return "Exe3_Fan{" +
                    "' speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color +
                    "', quạt đang bật "+
                    '\'' +
                    '}';
        }else {
            return "Exe3_Fan{" +
                    "' radius=" + radius +
                    ", color='" + color +
                    "', quạt đang tắt "+
                    '\'' +
                    '}';
        }
        }


    public static void main(String[] args) {
        Exe3_Fan fan1 = new Exe3_Fan();
        fan1.setSpeed(4);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1);
        Exe3_Fan fan2 = new Exe3_Fan();
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println(fan2);

    }
}
