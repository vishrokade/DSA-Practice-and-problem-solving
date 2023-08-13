package College;

import java.util.*;
//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode() {
//    }
//
//    ListNode(int val) {
//        this.val = val;
//    }
//
//    ListNode(int val, ListNode next) {
//        this.val = val;
//        this.next = next;
//    }
//}

public class DoubleListvalues {
    public static void main(String[] args) {

        ListNode node = new ListNode(9);

        ListNode node2 = new ListNode(8,node);
        ListNode node3 = new ListNode(1,node2);
        ListNode head = node3;

        ListNode ans = doubleIt(head);

        while (ans != null){
            System.out.println(ans.val);
            ans = ans.next;
        }

    }

        static ListNode doubleIt(ListNode head) {

            List<Integer> digits = new ArrayList<>();

            // Extract digits from the linked list
            while (head != null) {
                digits.add(head.val);
                head = head.next;
            }



            int no = (digits.size()-1);
            ListNode t = new ListNode((digits.get(no) * 2) % 10);
            int carry = (digits.get(no) * 2) / 10;

            for(int i = digits.size()-2; i >= 0;i--){
                no = digits.get(i) * 2 + carry;
                ListNode node = new ListNode(no % 10);
                carry = no / 10;
                node.next = t;
                t = node;
            }
            if(carry > 0){
                ListNode node = new ListNode(carry);
                node.next = t;
                t = node;
            }

            return t;
        }

}
