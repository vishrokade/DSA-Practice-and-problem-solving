package SlidingWindow;

import java.util.ArrayList;

public class MaxSubarray {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,5,1,23};
        int windowSize = 3;
        //int sum = find(arr,windowSize);

        int sum = find1(arr,windowSize);

        System.out.println(sum);
    }
    static int find(int[] nums,int k){  //brute force method to find the maximum sub-array
        // when the size of window is given

        int sum = Integer.MIN_VALUE;
        int temp = 0;

        for (int i = 0; i < nums.length-k+1; i++) {  // (nums.length-k+1) here +1 for the end window size arrangement
            for (int j = i; j < i+3; j++) {
                temp += nums[j];
            }
            if (temp > sum){
            sum = temp;
            }
            temp=0;
        }

        return sum;
    }

    static int find1(int[] nums,int k){
        int sum = Integer.MIN_VALUE;
        int temp = 0;
        int n = nums.length;

        for (int i = 0; i < n-2; i++) {
            temp = nums[i]+nums[i+1]+nums[i+2];
           sum = Math.max(temp,sum);
        }
        return sum;
    }


}
