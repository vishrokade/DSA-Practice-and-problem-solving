package College;

public class MinAbsDifference {
    public static void main(String[] args) {

        int[] nums = {4,3,2,4};
        int x = 2;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+x; j < nums.length; j++) {
                if (Math.abs(i-j) >= x){
                    min = Math.min(min , Math.abs(nums[i] - nums[j]));
                }
            }
        }

        System.out.println(min);
    }
}
