package Ss3_Arrays_And_Methods_In_Java.Exercise;

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập ký tự cần đếm :");
        String characters = scanner.nextLine();
        String chain = "coong vhbjgh ";
        int count = 0;
//        System.out.println(chain.charAt(0));
        for (int i = 0; i < chain.length() ; i++) {
            if (characters.equals(chain.charAt(i))){
                count++;
            }
        }
        System.out.println("ký tự "+characters+" xuất hiện "+count+" lần ");

    }
}
