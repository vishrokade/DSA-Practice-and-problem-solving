package linkedlist;


public class LL {

    private class Node{
        private  int val;
       private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertfirst(int val){
        Node node = new Node(val);
       node.next = head;
       head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertlast(int val){
        //if there is no tail node then we have to traverse each time till the end of the list and then
        // have to insert at the end
        Node node = new Node(val);
        tail.next = node;
        tail = node;

        size++;
    }

    public void insert(int val, int index){
        if(index == 0){
            insertfirst(val);
            return;
        }
        if(index == size){
            insertlast(val);
            return;
        }
        Node temp = head;
        for(int i= 1; i<index; i++){
            temp = temp.next;
        }

        Node node  = new Node(val,temp.next);
        temp.next = node;
        size++;


    }

    public int deletelst(){
        if(size <= 1){
            deletefirst();
        }

        Node secondlast = get(size -2);
        int val = tail.val;
        tail = secondlast;
        tail.next = null;

        return val;
    }

    public int delete(int index){
        if(index == 0){
            deletelst();
        }
        if(index == size){
            deletelst();
        }

        Node prev =  get(index -1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        size--;

        return val;
    }

    public Node get(int index){
        Node temp = head;

        int number = 0;
        for(int i = 0; i < index; i++){
            temp = temp.next;
            number = i;
        }
        return temp;
    }

    public int deletefirst(){

        int val = head.val;
        head =head.next;
        if(head == null){
            tail =null;
        }
        size--;
        return val;
    }
    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.println("END");

    }

}
