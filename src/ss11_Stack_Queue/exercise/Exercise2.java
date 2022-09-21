package ss11_Stack_Queue.exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào một chuỗi :");
        String string = scanner.nextLine();
        System.out.println(string.toLowerCase());

        String[] arrSplit = string.toLowerCase().split(" ");

        Map<String,Integer> countWord = new TreeMap<>();
        for (int i = 0; i <arrSplit.length ; i++) {
            if (countWord.containsKey(arrSplit[i])){
                countWord.put(arrSplit[i], countWord.get(arrSplit[i])+1);
            }else{
                countWord.put(arrSplit[i], 1);
            }
        }
        System.out.println(countWord);
    }
}
