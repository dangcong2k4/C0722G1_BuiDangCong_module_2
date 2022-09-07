package ss2_loop_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số cần them ");
        int number = scanner.nextInt();
        System.out.print("nhập vi tri cần them ");
        int index = scanner.nextInt();
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.print("Truoc khi them: ");
        System.out.println(Arrays.toString(arr));

        for (int i = arr.length -1; i > index; i--) {
            arr[i]=arr[i-1];
        }
        arr[index]=number;
        System.out.print("sau khi them: ");
        System.out.println(Arrays.toString(arr));
    }
}
