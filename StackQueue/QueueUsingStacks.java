package StackQueue;
import java.util.Stack;

public class QueueUsingStacks {
    public static void main(String[] args) {

        queue q = new queue();
        q.insert(4);
        q.insert(5);
        System.out.println(q.peek());
        System.out.println(q.remove());

    }


 static class queue {

        static  Stack<Integer> first = new Stack<>();
        static  Stack<Integer> second = new Stack<>();



        static void insert(int item) {
            first.push(item);
        }

        static int remove() {

            while (!first.isEmpty()) {
                second.push(first.pop());
            }
            int removed = second.pop();

            while (!second.isEmpty()) {
                first.push(second.pop());
            }
            return removed;
        }

        static int peek() {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
            int peek = second.peek();

            while (!second.isEmpty()) {
                first.push(second.pop());
            }
            return peek;
        }

        public boolean isEmpty() {
            return first.isEmpty();
        }
    }
}



