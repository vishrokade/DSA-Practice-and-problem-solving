package Generics;

import java.util.Arrays;

public class CustomArrayList {

    private int data[];
    private int Deafault_size = 10;
    private int size=0;  // it will work as index value

    public CustomArrayList() {
        this.data = new int[Deafault_size];
    }

    public CustomArrayList(int size) {
        this.data = new int[size];
    }

    public void add(int item){
        if (isfull()){
            resize();
        }
        data[size]=item;
        size++;
    }

    public int remove(){
        int removed = data[size-1];
        size--;
        return removed;
    }

    public void set(int index,int value){
        data[index] = value;
    }
    public int get(int index){
        return data[index];
    }

    public int size(){

        return size;
    }

    private void resize(){
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public boolean isfull(){
        return size == data.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList(5);
        list.add(5);
        list.add(10);
       // list.set(1,24);
       // list.size();
       // list.remove();
        list.get(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);

        System.out.println(list);
    }

}
