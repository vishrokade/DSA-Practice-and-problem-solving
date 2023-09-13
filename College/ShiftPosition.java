package College;

import java.util.Arrays;

public class ShiftPosition {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6};
        System.out.println("before shift");
        System.out.println(Arrays.toString(nums));
        int shift = 3;

        int temp[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            temp[(i+shift)%nums.length] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }

        System.out.println(Arrays.toString(nums));
    }


}
