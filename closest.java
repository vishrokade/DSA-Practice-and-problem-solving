import java.util.Arrays;

public class closest {
    public static void main(String[] args){
        int[] num = new int[]{-1,2,1,4};
        int target = 9;

        int ans = helper2(num,target);
        System.out.println("answer is  "+ans);
    }

    private static int helper(int[] nums, int target) {

        Arrays.sort(nums);
        int sum =0;
        for(int i = 0; i<nums.length ;i++){

            if(sum>target){
                return sum;
            }
            sum = sum+nums[i];
        }
        return -1;
    }
    private static int helper2(int[] nums, int target){
        Arrays.sort(nums);
        int relDist = Integer.MAX_VALUE;
        int ans = 0;

        for (int i=0; i<nums.length; i++) {
            int first = nums[i];

            int start = i+1;
            int end = nums.length - 1;

            while (start < end) {

                int sum = first + nums[start] + nums[end];

                if (Math.abs(target - sum) < relDist) {
                    relDist = Math.abs(target - sum);
                    ans = sum;
                }

                if (sum > target) {
                    end--;
                }
                else if (sum < target){
                    start++;
                }
                else {
                    break;
                }
            }
        }

        return ans;
    }

}
