package College;

public class SumOfSubArray {
    public static void main(String[] args) {
        int[] nums  = {1,2,3};
        int t = 3;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum+=nums[j];
                if (sum == t){
                    count++;
                }

            }
        }

        System.out.println(count);
    }
}
