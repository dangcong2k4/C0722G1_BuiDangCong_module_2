package ss2_loop_in_java.exercise;


import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1.hình chữ nhật \n"+
                "2.hình tam giác vuông \n"+
                "3.hình tam giác cân\n"+
                "hãy nhập hình cần hiện thị :");
        int choosePicture = scanner.nextInt();
        switch (choosePicture){
            case 1:
                for (int i = 0; i <5 ; i++) {
                    for (int j = 0; j <5 ; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
            case 2:
                int count = 1;
                for (int i = 0; i <5 ; i++) {
                    for (int j = 0; j <count ; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                    count++;
                }
            case 3:
                int k = 6;
                for (int i = 1; i <=k ; i++) {
                    for (int d = 1; d <= k-i ; d++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
        }
    }
}