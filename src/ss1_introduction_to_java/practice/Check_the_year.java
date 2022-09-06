package ss1_introduction_to_java.practice;

import java.util.Scanner;

public class Check_the_year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.print("hãy nhập năm vào đây :");
        year = scanner.nextInt();
        if (year%4==0){
            if (year%100==0){
                if(year%400==0){
                    System.out.print("năm "+year+" là năm nhuận ");
                }else {
                    System.out.print("năm "+year +" không phải là năm nhuận");
                }
            }else {
                System.out.print("năm "+year+" là năm nhuận ");
            }
        }else {
            System.out.print("năm "+year +" không phải là năm nhuận");
        }
    }
}
