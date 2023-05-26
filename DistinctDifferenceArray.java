import java.util.Arrays;
import java.util.HashSet;

public class DistinctDifferenceArray {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        find(arr);
    }

    static void find(int[] nums){
        int[] pre = new int[nums.length];
        int[] suf = new int[nums.length];

        int[] ans = new int[nums.length];

        for (int i = 0; i < pre.length; i++) {
            pre[i] = findDistinct(nums,0,i);
        }
        for (int i = 0; i < suf.length-1; i++) {
            suf[i] = findDistinct(nums,i+1,nums.length-1);
        }

        for (int i = 0; i < ans.length; i++) {
            ans[i] = pre[i] - suf[i];
        }
        System.out.println(Arrays.toString(ans));
    }

    static int findDistinct(int[] nums, int start,int end){
        HashSet<Integer> h = new HashSet<>();
        for (int i = start; i <= end; i++) {
            h.add(nums[i]);
        }
        return h.size();
    }
}
