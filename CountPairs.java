import java.util.Arrays;

public class CountPairs {
    public static void main(String[] args){
        int[] arr = {0,1,7,4,4,5};
        System.out.println(find(arr,3,6));
    }
    static int find(int[] nums,int lower,int upper){
        Arrays.sort(nums);
        int count = 0;
       /* int n = nums.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
              //  if((i>=0 && i<n) && (j>=0 && j < n) && (i!=j)){
                    if (lower <= nums[i] + nums[j] && nums[i] + nums[j] <= upper){
                        count++;
                    }
                //}
            }
        }

        */

        int i = 0;
        int low = nums.length-1,high = nums.length-1;

        while (i<high){
            low = Integer.max(i,low);
            while (low>i && nums[i]+nums[low] >= lower){
                --low;
            }

            while (high > low && nums[i]+nums[high] > upper){
                --high;
            }
            count +=(high-low);
            i++;
        }
        return count;
    }
}
