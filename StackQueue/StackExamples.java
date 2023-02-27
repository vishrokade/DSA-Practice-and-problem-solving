package StackQueue;

import java.util.Arrays;
import java.util.Stack;

public class StackExamples {
    public static void main(String[] args) throws Exception{

//        Stack<Integer> stack = new Stack<>();
//
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//
//        System.out.println("top of the stack is  "+stack.peek());
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        CustomStack stack = new DynamicStack();

        stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.push(50);
        stack.push(50);
        stack.push(50);
        stack.push(50);
        stack.push(50);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
      //  stack.pop();


        int[] x = {1,2,3,4};
        int[] y = new int[x.length * 2];

        x=y;

        System.out.println(Arrays.toString(x));
    }
}
