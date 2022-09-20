package ss11_Stack_Queue.exercise;

import java.util.Scanner;
import java.util.Stack;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stackBinary = new Stack<>();
        System.out.println("hãy nhập một số thập phân :");
        int decimal = Integer.parseInt(scanner.nextLine());

        while (decimal>0){
            stackBinary.push(decimal%2);
            decimal/=2;
        }
        System.out.println("số nhị phân là :");
        int size = stackBinary.size();
        for (int i = 0; i < size; i++) {
            System.out.print(stackBinary.pop());
        }
    }
}
