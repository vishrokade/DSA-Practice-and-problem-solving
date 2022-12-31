import java.util.Stack;

//https://leetcode.com/problems/evaluate-reverse-polish-notation/description/
public class StackSum {
    public static void main(String[] args){
        String[] arr = {"4","13","5","/","+"};

        int ans = findsum(arr);
        System.out.println(ans);
    }

    private static int findsum(String[] arr) {

        Stack<Integer> stack = new Stack<>();

        for(String token : arr){
            if ("+".equals(token)){
                stack.push(stack.pop() + stack.pop());
            } else if ("-".equals(token)) {
                stack.push(stack.pop() - stack.pop());
            } else if ("*".equals(token)) {
                stack.push(stack.pop() * stack.pop());
            }
            else if ("/".equals(token)){
                stack.push((int)(1D / stack.pop() * stack.pop()));
            }
            else {
                stack.push(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }
}
