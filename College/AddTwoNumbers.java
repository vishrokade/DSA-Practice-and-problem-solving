package College;

import java.util.*;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class AddTwoNumbers {
    public static void main(String[] args) {

       ListNode one = new ListNode();
       ListNode two = new ListNode();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter list one");

        for (int i = 0; i < 3; i++) {
            ListNode temp = new ListNode(sc.nextInt());
            temp.next = one;
            one = temp;
        }

        System.out.println("enter list two");

        for (int i = 0; i < 3; i++) {
            ListNode temp = new ListNode(sc.nextInt());
            temp.next = two;
            two = temp;
        }

//        while (head != null){
//            System.out.println(head.val);
//            head = head.next;
//        }

        ListNode ans = addTwoList(one ,two);

        while (ans != null){
            System.out.println(ans.val);
            ans = ans.next;
        }
    }

    static ListNode addTwoList(ListNode l1,ListNode l2){
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        while(l1 != null){
            s1.push(l1.val);
            l1 = l1.next;
        }

        while(l2 != null){
            s2.push(l2.val);
            l2=l2.next;
        }


        int sum  = 0;
        int carry = 0;

        ListNode ans = new ListNode();

        while(!s1.empty() || !s2.empty()){
            if(!s1.empty()){
                sum = sum + s1.pop();
            }
            if(!s2.empty()){
                sum = sum + s2.pop();
            }

            ans.val = sum % 10;
            carry = sum / 10;

            ListNode temp = new ListNode(carry);
            temp.next = ans;
            ans = temp;
            sum = carry;
        }

        if(carry == 0){
            return ans.next;
        }
        return ans;
    }

    static ListNode addTwoList2(ListNode one , ListNode two){

        ListNode ans =  new ListNode();
        ListNode temp = ans;
        int sum = 0, carry =0;
        int x =0,y=0;
        while (one != null || two != null || carry != 0){
            if (one != null){
                 x = one.val;
            }
            if (two != null){
                 y = two.val;
            }

            sum = carry + x + y;
            carry = sum / 10;

            temp.next = new ListNode(sum%10);
            temp = temp.next;

            if (one != null){
                one = one.next;
            }
            if (two != null){
               two = two.next;
            }



        }
        return ans.next;
     }
}
