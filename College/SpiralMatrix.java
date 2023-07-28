package College;

import java.util.ArrayList;

public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        ArrayList<Integer> list = new ArrayList<>();

        int n = nums.length;
        int m = nums[0].length;

        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;


        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                list.add(nums[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                list.add(nums[i][right]);
            }
            right--;


            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(nums[bottom][i]);
                }
                bottom--;

            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(nums[i][left]);
                }
                left++;
            }
        }

        System.out.println(list);
    }

}
