package ss1_introduction_to_java.practice;

import java.util.Scanner;

public class Weight_index {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("nhập cân nặng :");
        double weight = scanner.nextDouble();
        System.out.println("nhập chiều cao :");
        double height = scanner.nextDouble();
        double bmi = weight/(height*height);

        if(bmi<18.5){
            System.out.printf("chỉ số cân nặng là : %.2f\n", bmi ," bạn bị thiếu cân");
        }else if(bmi>=18.5 && bmi<25.0){
            System.out.printf("chỉ số cân nặng là : %.2f\n", bmi,  " cân nặng của bạn bình thường ");
        }else if(bmi>=25.0 && bmi<30.0){
            System.out.printf("chỉ số cân nặng là : %.2f\n", bmi ,"bạn bị thừa cân ");
        }else {
            System.out.printf("chỉ số cân nặng là : %.2f\n", bmi,  "bạn bị béo phì ");
        }
    }
}
