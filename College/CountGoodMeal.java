package College;

import java.util.ArrayList;

public class CountGoodMeal {
    public static void main(String[] args) {

        int[] nums = {149,107,1,63,0,1,6867,1325,5611,2581,39,89,46,18,12,20,22,234};
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            list.add((int) Math.pow(2,i));
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(list.get(i));
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (list.contains(nums[i] + nums[j])){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
