package ss15_debug_Java.exercise;

import java.util.Scanner;

public class IllegalTriangleExceptionExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào cạnh a :");
        int numberA = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào cạnh b :");
        int numberB = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào cạnh c :");
        int numberC = Integer.parseInt(scanner.nextLine());
        positiveNumbers(numberA,numberB,numberC);

    }
    public static void positiveNumbers(int edgeA,int edgeB, int edgeC){
        try{
            if(edgeA<0){
                throw new IllegalTriangleException("bạn đã nhập cạnh a âm");
            }else if (edgeB<0){
                throw new IllegalTriangleException("bạn đã nhập cạnh b âm");
            }else if (edgeC<0){
                throw new IllegalTriangleException("bạn đã nhập cạnh c âm");
            }
            if (edgeA+edgeB<edgeC){
                throw new IllegalTriangleException("bạn đã nhập cạnh a cộng cạnh b nhỏ hơn cạnh c");
            }else if (edgeA+edgeC<edgeB){
                throw new IllegalTriangleException("bạn đã nhập cạnh a cộng cạnh c nhỏ hơn cạnh b");
            }else if (edgeB+edgeC<edgeA){
                throw new IllegalTriangleException("bạn đã nhập cạnh b cộng cạnh c nhỏ hơn cạnh a");
            }else {
                throw new IllegalTriangleException("bạn đã nhập các cạnh của tam giác đúng ");

            }
        }catch (IllegalTriangleException e){

            System.out.println(e.getMessage());
        }

    }



}
