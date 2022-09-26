package ss1_introduction_to_java.practice;

import java.util.Scanner;

public class GiaiThuat {
    public static void main(String[] args) {
        String str = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String[] arrSplit = str.split("");

        System.out.println("nhập vào một chuỗi ");
        Scanner scanner =new Scanner(System.in);
        String line = scanner.nextLine();
        String[] arrSplit1 = line.split("");

        for (int i = 0; i <line.length() ; i++) {
            boolean test = false;
            String tr2 = "";
            for (int j = 0; j <str.length() ; j++) {
                if (arrSplit1[i].equals(arrSplit[j])){
                    tr2 = arrSplit1[i].toLowerCase();
                    test = true;
                    break;
                }else {
                    tr2 = arrSplit1[i];
                }

            }
            if (test){
                System.out.print(" "+tr2);
            }else {
                System.out.print(tr2);
            }

        }

    }
}
