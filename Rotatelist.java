public class Rotatelist {
    class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {

    }
    public ListNode rotateRight(ListNode head, int k) {
            int count = 1;
            ListNode temp = head;
            if (head == null || k == 0) {
                return head;
            }

            while(temp.next != null){
                temp = temp.next;
                count++;
            }
            int cut = k % count;
            if (cut == 0) {
                return head;
            }

            ListNode newTail = head;
            for (int i = 0; i < count - cut - 1; i++) {
                newTail = newTail.next;
            }

            ListNode newHead = newTail.next;
            newTail.next = null;
            temp.next = head;

            return newHead;
            //System.out.println(count);
        }
}
