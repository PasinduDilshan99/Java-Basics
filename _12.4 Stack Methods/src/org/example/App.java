package org.example;

import java.util.Stack;

public class App {
    public static void main(String[] args) {
        Stack<Integer> demo = new Stack<>();
        demo.push(0);
        demo.push(1);
        demo.push(2);
        demo.push(3);
        demo.push(4);
        demo.push(5);
        demo.pop();

        for (Integer tem: demo) {
            System.out.println(tem);
        }
        System.out.println("peek is : " + demo.peek());

        if (demo.isEmpty()){
            System.out.println("Stack is empty");
        }else {
            System.out.println("stack is not empty");
        }

    }
}
