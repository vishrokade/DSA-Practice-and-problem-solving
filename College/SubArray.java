package College;

import java.util.ArrayList;
import java.util.Arrays;

//subarray with given sum
public class SubArray {
    public static void main(String[] args) {

        int nums[] = {1,2,3,7,5};
        int target = 12;

        ArrayList<Integer> list = new ArrayList<>();

        int left = 0;
        int right = 0;

        int sum = 0;

        while (right <  nums.length){
            sum += nums[right];

            while (sum > target && left <= right){
                sum -= nums[left];
                left++;
            }

            if (sum == target){
                System.out.println(left+" "+right);
            }

            right++;

        }

    }
}
