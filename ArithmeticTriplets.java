import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/number-of-arithmetic-triplets/description/
public class ArithmeticTriplets {
    public static void main(String[] args){
        int[] arr = {4,5,6,7,8,9};
        int diff = 2;
        System.out.println(triplets(arr,diff));
    }

    private static int triplets(int[] arr, int diff) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {

                    if (arr[j] - arr[i] == diff && arr[k] - arr[j] == diff){
                        count++;
                    }

                }

            }

        }
        return count;


    }
}
