package College;
// this algorithm is used to find the maximum continues sum of array(subarray).
public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-4,8,-5,1};

        int ans = findSum(arr);
        System.out.println(ans);
    }

    static int findSum(int[] nums){
        int maxSum = nums[0];
        int maxEnding = nums[0];  //both the variables assign to the same value

        for (int i = 1; i < nums.length; i++) {
            maxEnding = Math.max(nums[i] , maxEnding + nums[i]); //this statement checks that the current element
            // is greater or the previous elements addition is greater and assign the values to the maxending

            maxSum = Math.max(maxSum,maxEnding); // this statement assign the values to the maxsum variable
        }
        return maxSum;
    }
}
