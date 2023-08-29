package College;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/count-of-smaller-numbers-after-self/

//this answer is not enough we need more optimal solution to submit
public class CountOfSmaller {

    public static void main(String[] args) {
        int[] arr = {-1,-1};
        System.out.println(countSmaller(arr));
    }
    static List<Integer> countSmaller(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length;i++){
            list.add(count(i,nums[i],nums));
        }
        return list;
    }
    static int count(int start,int val,int[] nums){
        int count = 0;

        for (int i = start; i < nums.length; i++) {
            if (nums[i] < val){
                count++;
            }
        }

        return count;
    }
}

