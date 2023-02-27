package StackQueue;

public class CircularQueue {
    int[] data;

    private static final int  Default_size = 5;

    protected int end =0;
    protected int front = 0;
    private  int size = 0;

    public CircularQueue(){
        this(Default_size);
    }

    public CircularQueue(int size){
        this.data = new int[size];
    }

    public boolean insert(int item){

        if (isfull()){
            return false;
        }
        data[end] = item;
        end++;
        end = end % data.length;
        size++;
        return true;

    }

    public int remove() throws Exception{

        if (isEmpty()){
            throw new Exception("queue is empty");
        }
        int removed = data[front];
        front++;
        front = front % data.length;
        size--;
        return removed;
    }

    public void display() throws Exception{
        if (isEmpty()){
            throw new Exception("queue is empty");
        }
        int i = front;
        do {
            System.out.print(data[i] + "<-");
            i++;
            i = i % data.length;
        }while (i != end);
        System.out.println("END");
    }
    public boolean isfull(){
        if (size == data.length){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isEmpty(){
        if (size == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
