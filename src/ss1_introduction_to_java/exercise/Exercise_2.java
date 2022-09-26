package ss1_introduction_to_java.exercise;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhập số :");
        int number = scanner.nextInt();
        String[] array = {"zero","one","two","three","Four","five","six","seven","eight","nine","ten"};
        String[] array1 = {"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
        String[] array2 = {"twenty","thirty","forty","fifty","sixty","seventy","eighty ","ninety"};

        if (number<=10){
            System.out.print(array[number]);
        }else if (number<=20){
            System.out.print(array1[number-11]);
        }else if (number<100){
            int num = number%10;
            int num1 = number/10;
            if (num==0){
                System.out.print(array2[num1-2]);
            }else {
                System.out.print(array2[num1-2]+ " "+array[num]);
            }
        }else {
            int num = number/100;
            int num1 = number%100;
            int num2 = num1/10;
            int num3 = num1%10;
            if(num2>2){
                System.out.print(array[num]+" hundred "+array2[num2-2]+" "+array[num3]);
            }else if (num2==0 && num3==0){
                System.out.print(array[num]+" hundred");
            }else if (num2==1 && num3==0){
                System.out.print(array[num]+" hundred "+array[num1]);
            } else if(num2==0){
                System.out.print(array[num]+" hundred and "+array[num3] );
            }else if(num2==1){
                System.out.print(array[num]+" hundred and "+array1[num1-11]);
            }else if(num3==0){
                System.out.print(array[num]+" hundred "+array2[num2-2]);
            }
        }
    }
}
