package College;

import java.util.Arrays;
import java.util.Comparator;

public class IntervalOverlapping {
    public static void main(String[] args) {

        int[][] arr = //{{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        {{1,100},{11,22},{1,11},{2,12}};

        System.out.println(findAnswer(arr));
    }

    static int findAnswer(int[][] nums){

        Arrays.sort(nums, (a, b) -> Integer.compare(a[0],b[1]));


        int j = 0;
        int remove = 0;
//        for (int i = 1; i < nums.length; i++) {
//            int curr_end = nums[j][1];
//            int next_start = nums[i][0];
//            int next_end = nums[i][1];
//
//            if (next_start < curr_end){
//                remove++;
//                if (next_end < curr_end){
//                    j = i;
//                }
//            }else {
//                j = i;
//            }
//        }

        for (int i = 0; i < nums.length; i++) {
            for (int k = 0; k < nums[0].length; k++) {
                System.out.print(" "+nums[i][k]);
            }
            System.out.println();
        }

        return remove;
    }
}
