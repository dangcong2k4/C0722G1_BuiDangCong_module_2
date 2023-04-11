package ss19_string_regex.exercise;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("nhập tên lớp :");
        Scanner scanner = new Scanner(System.in);
        String className = scanner.nextLine();
        if (className.matches("^[ACP][0-9]{4}[G-M]$")){
            System.out.println("tên lớp hợp lệ ");
        }else {
            System.out.println("tên lớp không hợp lệ !!!");
        }

    }
}
