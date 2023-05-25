//https://leetcode.com/problems/maximum-subarray/description/
//sliding window approch
public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr = {5,66,-51,7,3};
       // int max = findMaximumSubarray(arr);
        //System.out.println(max);

        int[] nums = {1,2,3,4,5};
        System.out.println(MinimumSizeSubarray(nums,11));
    }

    static int findMaximumSubarray(int[] nums){
        int sum = 0 , maxi = Integer.MIN_VALUE;;
        int i = 0 , j = 0;

        while(j<nums.length){

            if(sum < 0 && nums[j] >= sum){
                sum = 0;
                i = j;
            }
            sum += nums[j];
            maxi = Math.max(maxi , sum);
            j++;
        }
        return maxi;
    }

    static int MinimumSizeSubarray(int[] nums,int target){
        int sum = 0 , min = Integer.MAX_VALUE;;
        int i = 0 , j = 0;
        int size;

        while(j<nums.length){

            sum += nums[j];
            if(sum >= target){
                sum = 0;
                size = j-i;
                min = Math.min(size,min);
                i = j;

            }

            j++;
        }
        if (min == Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}
