package Generics;

import java.util.Arrays;

public class CustomGenericsArraylist<T> {
        private Object data[];  // Every object in Java is an instance of a class.
    // The object class is the top-level class in Java and is the parent class for all other classes
        private int Deafault_size = 10;
        private int size=0;  // it will work as index value

        public CustomGenericsArraylist() {
            this.data = new Object[Deafault_size];
        }

        public CustomGenericsArraylist(int size) {
            this.data = new Object[size];
        }

        public void add(T item){
            if (isfull()){
                resize();
            }
            data[size]=item;
            size++;
        }

        public Object remove(){  // just reduce the index
            Object removed = data[size-1];
            size--;
            return removed;
        }

        public void set(int index,int value){
            data[index] = value;
        }
        public Object get(int index){
            return data[index];
        }

        public int size(){

            return size;
        }

        private void resize(){
            Object[] temp = new Object[data.length * 2];
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

            CustomGenericsArraylist<String> list = new CustomGenericsArraylist<>(5);
//            list.add(5);
//            list.add(10);
//            // list.set(1,24);
//            // list.size();
//            // list.remove();
//            list.get(1);
//            list.add(2);
//            list.add(2);
//            list.add(2);
//            list.add(2);
//            list.add(2);
            list.add("vishal");

            list.add("sumit");
            list.add("ramesh");
            System.out.println(list.remove());
            list.add("suresh");  //it will override the value at index  where "ramesh" string stored

            System.out.println(list);
        }
}


