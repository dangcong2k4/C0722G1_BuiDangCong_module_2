package ss11_Stack_Queue.exercise;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Character> queueChain = new ArrayDeque<>();
        Stack<Character> stackChain = new Stack<>();
        System.out.println("nhập vào một chuỗi ");
        String chain = scanner.nextLine();
        for (int i = 0; i < chain.length(); i++) {
            queueChain.add(chain.charAt(i));
            stackChain.push(chain.charAt(i));
        }
        int size = stackChain.size();
        boolean test = true;
        for (int i = 0; i <size/2 ; i++) {
            if (!stackChain.pop().equals(queueChain.poll())){
                test = false;
            }
        }
        if (test){
            System.out.println("đây là chuỗi Palindrome ");
        }else {
            System.out.println("đây không phải là chuỗi Palindrome ");
        }

    }
}
