import java.util.Arrays;

public class MaximumSumTriplet {
    public static void main(String[] args) {
       // int[] nums = {1000000,1,1000000};

      //  System.out.println(maximumTripletValue(nums));

        int[] nums = {1, 1, 1, 2, 3};

        for (int start = 0; start < nums.length; start++) {
            for (int end = start; end < nums.length; end++) {
                // Create a subarray from start to end
                int[] subarray = Arrays.copyOfRange(nums, start, end + 1);

                // Print the subarray
                System.out.println(Arrays.toString(subarray));
            }
        }
    }
    static long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long max = 0;
        for(int i = 0;i<n-2;i++){
            for(int j = i+1;j<n-1; j++){
                for(int k = j+1; k<n; k++){

                    long temp = nums[i] - nums[j];
                    temp = temp * nums[k];
                    max = Math.max(max,temp);

                }
            }
        }
        return max;
    }
}
