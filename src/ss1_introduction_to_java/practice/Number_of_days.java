package ss1_introduction_to_java.practice;

import java.util.Scanner;

public class Number_of_days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hãy nhập tháng vào : ");
        int month = scanner.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("tháng "+month+" có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("tháng "+month+" có 30 ngày");
                break;
            case 2:
                System.out.print("tháng "+month +" có 28 ngày hoặc 30 ngày");
                break;
        }
    }
}
