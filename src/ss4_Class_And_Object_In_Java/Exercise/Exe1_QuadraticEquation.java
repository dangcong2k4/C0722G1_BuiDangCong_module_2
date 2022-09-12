package ss4_Class_And_Object_In_Java.Exercise;

import java.util.Scanner;

public class Exe1_QuadraticEquation {
    double a;
    double b;
    double c;
    public Exe1_QuadraticEquation(){
    }
    public Exe1_QuadraticEquation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public String equation(){
        return "phương trình bậc 2 là :"+ a +"X^2 + " +b+"X + " + c +" = 0 ";
    }
    public double getDelta(){
        return b*b-4*a*c;
    }
    public String getNoSolution(){
        return "phương trình vô nghiệm ";
    }
    public double getDoubleSolution(){
        return (-b)/(2*a);
    }
    public double getRoot1(){
        return (-b+ Math.sqrt(getDelta()))/2*a;
    }
    public double getRoot2(){
        return (-b- Math.sqrt(getDelta()))/2*a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số a :");
        double a = scanner.nextDouble();
        System.out.print("nhập số b :");
        double b = scanner.nextDouble();
        System.out.print("nhập số c :");
        double c = scanner.nextDouble();

        Exe1_QuadraticEquation quadraticEquation = new Exe1_QuadraticEquation(a,b,c);
        System.out.println(quadraticEquation.equation());
        if (quadraticEquation.getDelta()<0){
            System.out.println(quadraticEquation.getNoSolution());
        }else if (quadraticEquation.getDelta()==0){
            System.out.println("phương trình có nghiệm kép : X1 = X2 = "+quadraticEquation.getDoubleSolution());
        }else {
            System.out.println("phương trình có nghiệm X1 = "+quadraticEquation.getRoot1());
            System.out.println("phương trình có nghiệm X2 = "+quadraticEquation.getRoot2());
        }
    }
}
