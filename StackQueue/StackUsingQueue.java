package StackQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class MyStack{
    Queue<Integer> queue;
    public MyStack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
            queue.add(x);

    }

    public int pop() {
        if (queue.isEmpty()){
            return -1;
        }
        Queue<Integer> temp = new LinkedList<>();
        while (queue.size() != 1){
            temp.add(queue.remove());
        }
        int popedEle = queue.remove();

        while (!temp.isEmpty()){
            queue.add(temp.remove());
        }
        return popedEle;
    }

    public int top() {
        if (queue.isEmpty()){
            return -1;
        }
        Queue<Integer> temp = new LinkedList<>();
        while (queue.size() != 1){
            temp.add(queue.remove());
        }
        int popedEle = queue.remove();

        while (!temp.isEmpty()){
            queue.add(temp.remove());
        }
        queue.add(popedEle);
        return popedEle;
    }

    public boolean empty() {
        if (queue.isEmpty()){
            return true;
        }
        return false;
    }
}
public class StackUsingQueue {
    public static void main(String[] args) {

        MyStack st = new MyStack();
        st.push(1);
        st.push(2);
        st.push(3);

        System.out.println(st.top());
        System.out.println(st.pop());

    }
}

