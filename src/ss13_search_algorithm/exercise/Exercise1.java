package ss13_search_algorithm.exercise;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hãy nhập vào một chuỗi :");
        String string = scanner.nextLine();

        byte[] bytes = string.getBytes(StandardCharsets.US_ASCII);

        System.out.print((char)bytes[0]);
        for (int i = 1; i <string.length(); i++) {
            if (bytes[i] >bytes[i-1] ){
                System.out.print((char)bytes[i]);
            }
        }

    }
}
