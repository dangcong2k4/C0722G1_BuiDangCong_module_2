package ss4_Class_And_Object_In_Java.Practice;

import java.awt.*;
import java.util.Scanner;

public class Practice_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập chiều rộng :");
        double width = scanner.nextDouble();
        System.out.print("nhập chiều dài :");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("hình chữ nhật của bạn \n"+rectangle.display());
        System.out.println("chu vi của hình chữ nhật :"+ rectangle.getPerimeter());
        System.out.println("diện tích hình chữ nhật :"+ rectangle.getArea());
    }
}
