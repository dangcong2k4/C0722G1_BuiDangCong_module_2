package Ss3_Arrays_And_Methods_In_Java.Exercise;

import java.util.Arrays;

public class Exercise_4 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,8,8},{9,18,11,12},{13,14,15,16}};

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j] +"\t");
            }
            System.out.println("\n");
        }

        int sum =0;
        int j = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i][j];
            j++;
        }
        System.out.println("tổng các số ở đường chéo của ma trận hình vuông là : "+sum);

        int k = 0;
        int sum1 = 0;
        for (int i = arr.length-1; i >=0 ; i--) {
           sum1+=arr[i][k];
           k++;
        }
        System.out.println("tổng các số ở đường chéo của ma trận hình vuông là : "+sum1);
    }
}
