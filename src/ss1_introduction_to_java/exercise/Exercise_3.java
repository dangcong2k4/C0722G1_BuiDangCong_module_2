package ss1_introduction_to_java.exercise;

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("mời bạn nhập số tiền USD :");
        usd = sc.nextDouble();
        double doiTien = usd*23000;
        System.out.print("gía trị VND là :"+ doiTien);
    }
}
