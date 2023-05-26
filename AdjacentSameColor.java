import java.util.Arrays;
import java.util.HashSet;

public class AdjacentSameColor {
    public static void main(String[] args) {
        int[][] arr = {{0,2},{1,2},{3,1},{1,1},{2,1}};
        int n = 4;
        colorTheArray(arr,n);
    }
    static void colorTheArray(int[][] nums,int n){
        int temp[] = new int[n];

        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[nums[i][0]] = nums[i][1];
            ans[i] = findCount(temp);
        }

        System.out.println(Arrays.toString(ans));
    }
    static int findCount(int[] array){
        int count = 0;
        for (int i = 1; i < array.length; i++) {

            if (array[i] == array[i-1] && array[i] != 0){
                count++;
            }
        }

        return count;
    }
}
