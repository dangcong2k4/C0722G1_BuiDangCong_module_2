package ss1_introduction_to_java.practice;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] list = {3,5,4,6,1,0};
        for (int i = 0; i <list.length ; i++) {
            for (int j = 0; j <list.length -i-1 ; j++) {
                if (list[j]>list[j+1]){
                    int so = list[j];
                    list[j] = list[j+1];
                    list[j+1]= so;
                }
            }
        }
        System.out.println(Arrays.toString(list));

    }
}
