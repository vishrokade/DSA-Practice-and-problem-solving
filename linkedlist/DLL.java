package linkedlist;

import javax.swing.*;
import java.security.PrivateKey;

public class DLL {
    private Node head;
    private Node tail;
    private class Node{
        private int val;
       private Node next;
       private Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public DLL() {
    }

    public void insertFirst(int val){
       Node node = new Node(val);
       node.next = head;
       node.prev = null;
       if(head != null){
           head.prev = node;
       }

       head = node;
    }
    public void insertLast(int val) {
        Node node = new Node(val);
        if(head == null){
            head = node;
            node.prev = null;
        }
        Node last = head;

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
        node.next = null;
    }

    public void insertAfter(int after , int val){
        Node previous = find(after);

        if(previous == null){
            System.out.println("position not found");
            return;
        }

        Node node = new Node(val);
        node.next = previous.next;
        previous.next = node;
        node.prev = previous;
        if(node.next != null){
            node.next.prev = node;
        }

    }

    public Node find(int value){
        Node node = head;
        while (node != null){
            if(node.val == value) {
                return node;
            }
            node = node.next;

        }
        return null;
    }

    public void display(){

        Node node = head;
        Node last = null;

        while(node != null){
            System.out.print(node.val +"->");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        while(last != null){
            System.out.print(last.val + "->");
            last = last.prev;
        }
        System.out.println("START");
    }
}
