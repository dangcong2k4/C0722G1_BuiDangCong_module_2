package ss2_loop_in_java.exercise;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số lượng số nguyên tố cần in ra :");
        int number = scanner.nextInt();
        int count;
        int count1 = 0;
        for (int i = 2; ; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i%j==0){
                    count++;
                }
            }
            if (count==2){
                System.out.print(i + "\t");
                count1++;
            }
            if (count1==number){
                break;
            }
        }
    }
}


