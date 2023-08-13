package College;

public class MaxPairSum {
    public static void main(String[] args) {
        int[] nums = {51,71,17,24,42};
        int n = nums.length;
        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {

                if(check(nums[i]) == check(nums[j])){
                    max = Math.max(max,nums[i] + nums[j]);
                }
            }
        }

        System.out.println(max);
    }

    static int check(int no){

        int temp = 0;

        while (no != 0){
            temp = Math.max(temp , no%10);
            no /= 10;
        }
        return temp;
    }
}
