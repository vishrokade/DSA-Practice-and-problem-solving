//https://leetcode.com/problems/minimum-size-subarray-sum/
package SlidingWindow;
public class FindMaxSubarr {

    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;

        System.out.println(MinimumSizeSubarray(arr,target));
    }
    static int MinimumSizeSubarray(int[] nums,int target) {
        int i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        while (j < nums.length) {
            sum += nums[j];
            if (sum >= target) {
                while (sum >= target) {
                    min = Math.min(min, j - i + 1);
                    sum -= nums[i];
                    i++;
                }
            }
            j++;
        }
        if (min == Integer.MAX_VALUE)
            return 0;
        else
            return min;
    }
}
