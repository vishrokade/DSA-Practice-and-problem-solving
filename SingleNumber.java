import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public static void main(String[] arg){
        int[] nums = {1,2,1,3,2,5};

        int[] ans = find(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] find(int[] nums){

        Arrays.sort(nums);
        int[] arr = new int[2];
        int j = 0;
        int count = 0;
        if (nums[nums.length-1] != nums[nums.length-2]){
            arr[j] = nums[nums.length-1];
            j++;
        }
        if (nums[0] != nums[1]){
            arr[j] = nums[0];
            j++;
        }



        for (int i = 1; i < nums.length-1; i++) {
            if (nums[i] == nums[i-1]){
                count++;
            } else if (nums[i] == nums[i+1]) {
                count++;
            }
            else {
                arr[j] = nums[i];
                j++;
            }
        }

        return arr;
    }
}
