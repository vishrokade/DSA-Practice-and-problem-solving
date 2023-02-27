package StackQueue;

public class CustomQueue {

    int data[];

    private static final int Defalut_size = 5;

    int end = 0;

    public CustomQueue(){
        this(Defalut_size);
    }

    public CustomQueue(int size){
        this.data = new int[size];
    }

    public boolean insert(int item){
        if(isfull()){
            return false;
        }
        data[end] = item;
        end++;
        return true;
    }

    public boolean isfull(){
        if (end == data.length){
            return true;
        }
        else {
            return false;
        }
    }

    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("queue is empty");
        }
        int removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        return removed;
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+"<-");
        }
        System.out.println("END");
    }

    public boolean isEmpty(){
        if (end == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
