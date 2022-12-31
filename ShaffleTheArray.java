import java.util.Arrays;

public class ShaffleTheArray {
    public static void main(String[] args){
        int[] nums = {2,5,1,3,4,7};
        int n = 3;

        System.out.println(Arrays.toString(shaffle(nums,n)));
    }

    private static int[] shaffle(int[] nums, int n) {

        int[] arr = new int[nums.length];
        int k = n;
        int j = 0;

        for(int i = 0; i < n;i++){

            arr[j] = nums[i];
            j++;

            arr[j] = nums[k];
            k++;
            j++;
        }

            return arr;
    }
}
