package StackQueue;

import java.util.Stack;

public class CustomStack {
    int data[];
    private static final int Default_size = 5;
    int ptr = -1;

    public CustomStack(){
        this(Default_size);
    }
    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if (isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;

        return true;
    }

    public int pop() throws Exception{
        if (isEmpty()){
            //System.out.println("Stack is empty");
            throw new Exception("Stack is empty");
        }

        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Stack is empty");
        }
        return data[ptr];
    }

    public boolean isFull(){
        return ptr == data.length-1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

}
