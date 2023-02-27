import java.util.Arrays;

public class LeftRightSumDiff {
    public static void main(String[] args){

        int[] nums ={1};
        int n = nums.length;
        int[] leftarr = new int[n];
        int[] rightarr = new int[n];
        int[] ans = new int[n];

        leftarr[0] = 0;

        for(int i = 1;i<n;i++){
            leftarr[i] = nums[i-1] + leftarr[i-1];
        }

       // System.out.println(Arrays.toString(leftarr));

        rightarr[n-1] = 0;
        for(int i = n-2;i>=0;i--){
            rightarr[i] = nums[i+1] + rightarr[i+1];
        }

       // System.out.println(Arrays.toString(rightarr));
        for(int i=0;i<n;i++){
            ans[i] = Math.abs(leftarr[i] - rightarr[i]);
        }
        System.out.println(Arrays.toString(ans));

    }
}
