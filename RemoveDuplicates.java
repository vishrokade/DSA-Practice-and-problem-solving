public class RemoveDuplicates {
    public static void main(String[] args){

        int[] nums = {1,1,1,2,2,3};
        int ans  = find(nums);

        System.out.println(ans);

    }
    static int find(int[] nums){

        int count1 = 1;
        int count2 = 0;
        for(int i = 0; i < nums.length-1;i++){
            if(nums[i+1] == nums[i]){
                count1++;
            }
            if (nums[i+1] != nums[i] && count1 == 1){
                count2 = count2 + 1;
            }
            if(nums[i+1] != nums[i] && count1 >= 2){
                count2 = count2 + 2;
            }
        }

        return count2+1;
    }
}
