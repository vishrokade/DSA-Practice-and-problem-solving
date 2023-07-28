package College;

import java.util.Arrays;
import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] nums = arr;

        String str = "abbaca";

        nums[2] = 100;

       // System.out.println(Arrays.toString(arr));

        int x = 5,y=4;

//        System.out.println(x+" "+y);
//        System.out.println("after swapping");
//        x= x+y;
//        y = x-y;
//        x = x-y;
//
//        System.out.println(x+" "+y);

        Stack<Character> stack = new Stack<>();


        for (char ch : str.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch){
                stack.pop();
            }else {
                stack.add(ch);
            }
        }

        StringBuilder st = new StringBuilder();
        while (!stack.isEmpty()){
            st.append(stack.peek());
            stack.pop();
        }
        System.out.println(st.reverse().toString());
    }
}
