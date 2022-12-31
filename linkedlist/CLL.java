package linkedlist;

public class CLL {
    public CLL() {
        this.head = null;
        this.tail = null;
    }

    private Node head;
    private Node tail;
    private class Node{
       private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }


    public void insert(int val){
        Node node = new Node(val);

        if(head == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int val){
        Node node = head;

        if(head == null){
            return;
        }

        if(node.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            Node n = node.next;
            if(n.val == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node  != head);
    }

    public void display(){
        Node node =head;
        if(head != null){
            do{
                System.out.print(node.val  + "->");
                node = node.next;
            } while (node != head);
        }
        System.out.println("END");
    }
}
