package StackQueue;

import java.util.*;

public class QueueExamples {
    public static void main(String[] args) throws Exception {

      // CustomQueue queue = new CustomQueue(5);

      // CircularQueue queue = new CircularQueue(5);

       DynamicQueue queue = new DynamicQueue(5);

       queue.insert(2);
       queue.insert(23);
       queue.insert(34);
       queue.insert(2);
       queue.insert(21);


       queue.display();

       System.out.println(queue.remove());
       queue.insert(51);

       queue.display();


    }
}
