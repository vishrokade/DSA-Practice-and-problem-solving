package College;

import java.sql.Array;
import java.util.*;

//https://leetcode.com/problems/asteroid-collision/
public class AstroidCollision {
    public static void main(String[] args) {
        int[] nums = {-10,2,-5};

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < nums.length; i++) {
            if (st.isEmpty() || nums[i] > 0){
                st.push(nums[i]);
            }
            else {
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(nums[i])){
                    st.pop();
                }
                if (!st.isEmpty() && st.peek() == Math.abs(nums[i])){
                    st.pop();
                }
                else {
                    if (st.isEmpty() || st.peek() < 0){
                        st.push(nums[i]);
                    }
                }
            }
        }



        int ans[] = new int[st.size()];
        int size = st.size();
        while (!st.isEmpty()){
            ans[--size] = st.pop();
        }
        System.out.println(Arrays.toString(ans));

    }
}
