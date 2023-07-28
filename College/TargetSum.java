package College;

public class TargetSum {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int target = 1;

        int ans = findAns(nums,target);
        System.out.println(ans);
    }

    static int findAns(int[] nums,int target){
        int ans = find(nums,0,0,target,0);   // arr, index, sum, target
        return ans;
    }
    static int find(int[] nums,int index,int sum,int t, int ans){
        if (index == nums.length){
            if (sum == t){
                return 1;
            }
            else {
                return 0;
            }
        }
        ans = find(nums,index+1,sum + nums[index],t,ans) + find(nums,index+1,sum - nums[index],t,ans);
        return ans;
    }
}
