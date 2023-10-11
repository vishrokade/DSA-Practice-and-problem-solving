import java.util.Arrays;

public class FindFirstAndLastIndex {
    //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/?envType=daily-question&envId=2023-10-09
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(nums, 8)));
    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};

        int start = search(nums,target,true);
        int end = search(nums,target,false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }
    static int search(int[] nums,int target,boolean index){
        int ans = -1;

        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] < target){
                start = mid+1;
            }else if(nums[mid] > target){
                end = mid-1;
            }
            else{
                ans = mid;

                if(index){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }

        return ans;
    }


}
