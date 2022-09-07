package ss2_loop_in_java.exercise;

//import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        int count;
        for (int i = 2; i < 100 ; i++) {
            count = 0;
            for (int j = 1; j <= i ; j++) {
                if (i%j==0){
                    count++;
                }
            }
            if (count==2){
                System.out.print(i + "\t");
            }
        }
    }
}
