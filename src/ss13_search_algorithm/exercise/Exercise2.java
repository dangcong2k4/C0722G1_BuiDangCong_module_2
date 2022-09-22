package ss13_search_algorithm.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("độ dài của mảng: ");
        int n = Integer.parseInt(scanner.nextLine());
        int [] arr = new int [n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.print("nhập phần tử thứ "+ (i+1)+":");
            arr[i] = Integer.parseInt(scanner.nextLine());
            System.out.println();

        }
        int order = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    order = arr[j];
                    arr[j] = arr[i];
                    arr[i] = order;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("nhập số cần tìm ");
        int k = Integer.parseInt(scanner.nextLine());
        String string = binarySearch(arr,k, 0,arr.length-1);
        System.out.println(string);

    }
    static String binarySearch(int[] arr, int k, int left, int right){
        if (right>=left){
            int mid = (right+left)/2;
            if (arr[mid] == k){
                return "số "+k+" có trong mảng, ở vị trí "+mid;
            }
            if (k > arr[mid]){
                return binarySearch(arr, k,left+1,right);
            }
            return binarySearch(arr, k, left, right-1);
        }

        return "số "+k+" không có trong mảng ";
    }


}
