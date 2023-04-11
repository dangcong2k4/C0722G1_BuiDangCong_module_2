package Ss3_Arrays_And_Methods_In_Java.Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class alo {

    public static void main(String[] args) {
//        int[] arr={0,3,5,12};
//        int temp;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - 1 - i; j++) {
//                if (arr[j] ==0) {
//                    temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

//        int sum = 0 ;
//        int count;
//        for (int i = 1; i < 20; i++) {
//           count = 0;
//            for (int j = 1; j < 20; j++) {
//                if (i%j==0){
//                   count++;
//                }
//            }
//            if (count==2){
//                sum+=i;
//            }
//
//        }
//        System.out.println(sum);

//        Map<Character, Integer> map = new HashMap<>();
//        String str = "aabacsdc";
//        for (int i = 0; i < str.length(); i++) {
//            if (map.containsKey(str.charAt(i))) {
//                Integer num = map.get(str.charAt(i));
//                map.replace(str.charAt(i), num + 1);
//            } else {
//                map.put(str.charAt(i), 1);
//            }
//        }
//        System.out.println(map);
//        int num1=0;
//        int num2=1;
//        int fibonacci;
//        for (int i = 0; i < 100; i++) {
//            System.out.println(num1);
//            fibonacci = num1+num2;
//            num1 = num2;
//            num2 = fibonacci;
//            if (num1>100){
//                break;
//            }
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("nhập số ");
//        int number = scanner.nextInt();
//        int count=0;
//        for (int i = 1; i <= number; i++) {
//
//            if (number%i==0){
//                count++;
//            }
//        }
//        if (count==2) {
//            System.out.println(number+" là số nguyên tố");
//        }else {
//            System.out.println(number+" không phải là số nguyên tố");
//        }
//        String str1= "11:20:30";
//        String str2= "07:35:45";
//        String[] arr1 = str1.split(":");
//        String[] arr2 = str2.split(":");
//        int hh = Integer.parseInt(arr1[0])+Integer.parseInt(arr2[0]);
//        int mm = Integer.parseInt(arr1[1])+Integer.parseInt(arr2[1]);
//        if(mm>60){
//            mm = mm-60;
//            hh++;
//        }
//        int ss = Integer.parseInt(arr1[2])+Integer.parseInt(arr2[2]);
//        if(ss>60){
//            ss = ss-60;
//            mm++;
//        }
//        System.out.println(hh+":"+mm+":"+ss);

//        int[] arr = {1,2,4,65,7,2,4,3,8,9,7,6,5,8,2,5};
//        int n = 10;
//        int result ;
//        for (int i = 0; i < arr.length; i++) {
//            result = n - arr[i];
//            if(result>0){
//                for (int j = 0; j < arr.length; j++) {
//                    if (result==arr[j] && j!=i) {
//                        System.out.println(i +":"+ j);
//                    }
//                }
//            }
//        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("nhập số la mã: ");
//        String romanStr = scanner.nextLine();
//        Map<Character, Integer> romanMap = new HashMap<>();
//        romanMap.put('I', 1);
//        romanMap.put('V', 5);
//        romanMap.put('X', 10);
//        romanMap.put('L', 50);
//        romanMap.put('C', 100);
//        romanMap.put('D', 500);
//        romanMap.put('M', 1000);
//
//        int result = 0;
//        int prevValue = 0;
//        for (int i = romanStr.length() - 1; i >= 0; i--) {
//            char c = romanStr.charAt(i);
//            int curValue = romanMap.get(c);
//            if (curValue < prevValue) {
//                result -= curValue;
//            } else {
//                result += curValue;
//            }
//            prevValue = curValue;
//        }
//        System.out.println(result);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập dãy chữ số La Mã(chỉ sử dụng I,V,X,L,C,D,M): ");
        String str = scanner.nextLine();

        int[] arr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'I':
                    arr[i] = 1;
                    break;
                case 'V':
                    arr[i] = 5;
                    break;
                case 'X':
                    arr[i] = 10;
                    break;
                case 'L':
                    arr[i] = 50;
                    break;
                case 'C':
                    arr[i] = 100;
                    break;
                case 'D':
                    arr[i] = 500;
                    break;
                case 'M':
                    arr[i] = 1000;
                    break;
                default:
                    System.out.println("Số La Mã bạn nhập không đúng!");
                    System.exit(0);
            }
        }

        int num = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            int x = arr[i] - arr[i - 1];
            if (x == 4 || x == 9 || x == 40 || x == 90 || x == 400 || x == 900) {
                num -= arr[i - 1];
            } else if (x <= 0){
                num += arr[i - 1];
            } else {
                System.out.println("Số La Mã bạn nhập không đúng!");
                System.exit(0);
            }
        }

        System.out.println("Kết quả: " + num);
    }
}
