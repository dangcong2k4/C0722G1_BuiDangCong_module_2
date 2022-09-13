package ss6_Inheritance.Exercise.class_Point_and_MoveablePoint;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1,2,3,4);
        System.out.println(movablePoint.toString());
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
