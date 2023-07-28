package College;

import java.util.Stack;

public class LargeElementAfterMerge {
    public static void main(String[] args) {
       int[] nums = {2,3,5,7,9,3};
       int n = nums.length;
       int ans = 0;
       int sum = 0;

        for (int i = n-1; i >=0 ; i--) {
            if (nums[i] > sum){
                sum = 0;
            }
            sum = sum + nums[i];
            ans = Math.max(ans,sum);

        }

        System.out.println(ans);
    }
}
