package ss11_Stack_Queue.exercise;

import java.util.Scanner;
import java.util.Stack;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stackNumber = new Stack<>();
        Stack<Integer> stackNumber2 = new Stack<>();

        System.out.println("nhập độ dài của mảng ");
        int length = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < length; i++) {
            System.out.println("nhập phần tử thứ " + (i + 1));
            int number = Integer.parseInt(scanner.nextLine());
            stackNumber.push(number);
        }
        int number1 = stackNumber.size();
        System.out.println(stackNumber);
        System.out.println("sau khi lấy ra các phần tử :");
        for (int i = 0; i < number1; i++) {
            stackNumber2.push(stackNumber.peek());
            System.out.print(stackNumber.pop() + " ");
        }
        System.out.println();
        System.out.println("sau khi đưa các phần tử đó quay lại stack :");
        for (int i = 0; i < number1; i++) {
            stackNumber.push(stackNumber2.peek());
            stackNumber2.pop();
        }
        System.out.println(stackNumber);

        System.out.println();
        System.out.println("___________________");

        Stack<String> stackNumber1 = new Stack<>();
        System.out.println("nhập vào một chuỗi :");
        String line = scanner.nextLine();
        for (int i = 0; i < line.length(); i++) {
            stackNumber1.push(line.charAt(i) + "");
        }
        int strLenth = stackNumber1.size();
        System.out.println("chuỗi sau khi đảo ngược :");
        for (int i = 0; i < strLenth; i++) {
            System.out.print(stackNumber1.pop());
        }
    }
}
