package Ss3_Arrays_And_Methods_In_Java.Practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Fruit {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập dãy chữ số có 2 chữ số: ");
//
//        int number = scanner.nextInt();
//        int number2;
//        int number3;
//        int number4;
//        number2 = number%10;
//        number3 = number/10;
//        number4 = number2*10+number3;
//        System.out.println(number4);
//        Scanner sc = new Scanner(System.in);
////khai báo biến num1 là số cần đảo ngược, reversed là số sau khi đảo ngược
//        String num1;
//        int num2;
//        int reversed = 0;
//        System.out.println("\n\nNhập vào số cần đảo ngược: ");
//        num1 = sc.next();
//        num2 = Integer.parseInt(num1);
//        int count= num1.length()-String.valueOf(num2).length();
////sử dụng vòng lặp while để đảo ngược num2
//        while(num2 != 0) {
//            int digit = num2 % 10;
//            reversed = reversed * 10 + digit;
//            num2 /= 10;
//        }
////hiển thị số sau khi đảo ngược ra màn hình
//        System.out.printf("Số sau khi đảo ngược là: %d",  reversed);
//        for (int i = 0; i < count ; i++) {
//            System.out.print('0');
//        }
//        int[] arr = {1, 2, 3, 4, 5};
//
//        int max = arr[0];
//        int min = arr[0];
//        int sum = 0;
//
//        for (int i = 1; i <arr.length; i++){
//            if (arr[i] > max){
//                max = arr[i];
//            }
//            if (arr[i] < min){
//                min = arr[i];
//            }
//            sum += arr[i];
//        }
//
//        System.out.println("4 số lớn nhất " + (sum - min));
//        System.out.println("4 số nhỏ nhất " + (sum - max));



        int[] arr = {1, 2, 3, 4, 5,9,3};
        int count;
        for (int i = 0; i <arr.length ; i++) {
            count=0;
            for (int j = 0; j <arr.length ; j++) {
                if(arr[i]<arr[j]){
                    count++;
                }
            }
            if (count==1){
                System.out.println(arr[i]);
            }
        }

    }

}
