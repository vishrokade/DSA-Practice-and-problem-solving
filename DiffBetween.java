public class DiffBetween {
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        System.out.println(find(arr));

    }

    static int find(int[] nums){

        int  digit, sum = 0;
        int sum2 = 0;

        for (int i = 0; i < nums.length; i++) {
            sum2 = sum2 + nums[i];

        }
        for (int i = 0; i < nums.length; i++) {


            while (nums[i] > 0) {
                digit = nums[i] % 10;
                sum = sum + digit;
                nums[i] = nums[i] / 10;
            }
        }

        return sum2-sum;
    }
}
