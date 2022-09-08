package Ss3_Arrays_And_Methods_In_Java.Exercise;

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập ký tự cần đếm :");
        char characters = scanner.nextLine().charAt(0);

        String chain = "Bui Dang Cong";
        int count = 0;

        for (int i = 0; i < chain.length() ; i++) {
            if (chain.charAt(i)==characters){
                count++;
            }
        }
        System.out.println("ký tự "+characters+" xuất hiện "+count+" lần ");

    }
}
