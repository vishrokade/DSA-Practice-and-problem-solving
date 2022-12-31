public class Robbery {
    public static void main(String[] args){
        int[] nums = {2,7,9,3,1};
        System.out.println(rob(nums));

    }

    static int rob(int[] nums) {
        if (nums.length == 0){
            return 0;
        }

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < nums.length; i=i+2) {

            sum1 = sum1 + nums[i];
        }

        for (int i = 1; i < nums.length; i= i+2) {
            sum2 = sum2 + nums[i];
        }

        if(sum2 > sum1){
            return sum2;
        }
        return sum1;
    }

}
