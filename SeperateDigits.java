import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/contest/biweekly-contest-97/problems/separate-the-digits-in-an-array/
public class SeperateDigits {
    public static void main(String[] args){
        int[] arr = {13,25,45,68};

        System.out.println(Arrays.toString(find(arr)));

    }

    static int[] find(int[] arr){

        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> ans1 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            ans = palindrome(arr[i]);
            for (int num : ans) {
                ans1.add(num);
            }
        }

        int[] nums = new int[ans1.size()];
        int i = 0;
        for (int num : ans1){
            nums[i] = num;
            i++;
        }
        return nums;
    }

    static ArrayList<Integer> palindrome(int num){
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> array = new ArrayList<>();
        while (num > 0){
            int rem = num % 10;
            ans.add(rem);
            num = num/10;
        }
        for (int i = ans.size()-1; i >= 0; i--) {
            array.add(ans.get(i));
        }

        return array;
    }
}
