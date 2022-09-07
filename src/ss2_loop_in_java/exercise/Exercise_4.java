package ss2_loop_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số cần xóa ");
        int number = scanner.nextInt();

        int[] arr = {1,2,3,4,5,5,5,7,8,9,10};
        System.out.print("Truoc khi xoa: ");
        System.out.println(Arrays.toString(arr));
        System.out.print("\n");
        System.out.print("sau khi xoa: ");
        for (int i = 0; i <arr.length ; i++) {
            int index = -1;
            for (int l = 0; l <arr.length  ; l++) {
                if (number==arr[l]){
                    index=l;
                }
            }
            if (index!=-1){
                for (int j = index; j < arr.length-1 ; j++) {
                    arr[j]=arr[j+1];
                }
                arr[arr.length-1]=0;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

