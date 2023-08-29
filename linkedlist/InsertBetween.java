package linkedlist;
//https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/submissions/
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class InsertBetween {
    public static void main(String[] args) {
        ListNode head = new ListNode(18,new ListNode());
        head.next = new ListNode(6,new ListNode());
        head.next.next = new ListNode(10,new ListNode());
        head.next.next.next = new ListNode(3,null);

        insertGreatestCommonDivisors(head);

        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
    static ListNode insertGreatestCommonDivisors(ListNode head) {

        if(head == null){
            return head;
        }
        ListNode first = head;
        ListNode second = head.next;

        while(second != null ){
            int firstvalue = first.val;
            int secondvalue = second.val;
            int factor = findHcf(firstvalue,secondvalue);
            ListNode temp = new ListNode(factor);
            first.next = temp;
            temp.next = second;
            first = second;
            second = second.next;
        }

        return head;
    }

    static int findHcf(int a, int b)
    {
        // Find Minimum of a and b
        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }

        // Return gcd of a and b
        return result;
    }
}
