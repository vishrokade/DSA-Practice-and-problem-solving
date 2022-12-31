public class MakeArrayZero {
    public static void main(String[] args){


        int[] arr = {1,5,0,3,5};
        System.out.println(makezero(arr));
    }

    static int makezero(int[] nums){
        int count = 0;

        while(!allzeros(nums)){
            int minValue = Integer.MAX_VALUE;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= 0){
                    continue;
                }
                minValue = Math.min(nums[i],minValue);
            }

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= 0){
                    continue;
                }
                nums[i] = nums[i] - minValue;
            }

            count++;

        }
        return count;
    }

    private static boolean allzeros(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                return false;
            }

        }
        return true;
    }
}
