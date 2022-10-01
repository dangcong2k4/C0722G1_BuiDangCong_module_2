package ss19_string_regex.exercise;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("hãy nhập số điện thoại :");
        Scanner scanner = new Scanner(System.in);
        String phoneNumber = String.valueOf(scanner.nextLine());

        if (phoneNumber.matches("^[(][0-9]{2}[)][-][(][0][0-9]{9}[)]$")) {
            System.out.println("số điện thoại chính xác ");
        }else {
            System.out.println("nhập sai định dạng số điện thoại!!!");
        }
    }
}
