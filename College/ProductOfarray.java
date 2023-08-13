package College;

import java.util.Arrays;

public class ProductOfarray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        int[] ans = findans(arr);

        System.out.println(Arrays.toString(ans));
    }

    static int[] findans(int[] nums){

        int ans[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = product(nums,i);
        }

        return ans;
    }

    static int product(int[] nums,int index){
        int p = 1;

        for (int i = 0; i < nums.length; i++) {
            if (i == index){
                continue;
            }else {
                p = p * nums[i];
            }
        }

        return p;
    }
}
