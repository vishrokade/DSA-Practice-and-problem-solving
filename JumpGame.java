public class JumpGame {
    public static void main(String[] args){
        int nums[] = {2,5,0,0};
        System.out.println(jump(nums));
    }

    private static boolean jump(int[] nums) {

        int n = nums.length;
        int sum = 0;
        if (n == 1)
        {
            return true;
        }
        for (int j =0;j<n;j++){
            if (nums[j] == 0){
                break;
            }
            sum = sum+nums[j];
        }
        int i = 0;
        while(i < n){
            if (i == n-1){
                return true;
            }
            if (nums[i] == 0){
                return false;
            }
            i = i+nums[i];
        }
        if (i >= n-1){
            return true;
        }

        return false;
    }
}
