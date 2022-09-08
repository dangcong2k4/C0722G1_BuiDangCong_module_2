package Ss3_Arrays_And_Methods_In_Java.Exercise;

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hãy nhập cột cần tính tổng :");
        int pillar = scanner.nextInt();
        int[][] arr = {{1,2,3,4,5},{6,7,8,9},{7,6,5,4,3}};
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i][pillar];
        }
        System.out.println("tổng các số ở cột đó là : " +sum);
    }
}
