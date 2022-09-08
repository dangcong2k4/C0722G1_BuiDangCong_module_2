package Ss3_Arrays_And_Methods_In_Java.Exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài của mảng ");
        int num = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[num];
        int min ;
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("nhập phần tử thứ "+i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        min = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("số bé nhất trong mảng là : "+min);
    }
}
