import java.util.ArrayList;
import java.util.Arrays;

public class SlidingSubarray {
    public static void main(String[] args) {

        int[] arr = {-3,1,2,-3,0,-3};
        int k = 2;
        int x = 1;

        int[] ans = getSubarrayBeauty(arr,k,x);

        System.out.println(Arrays.toString(ans));
    }
    static int[] getSubarrayBeauty(int[] nums, int k, int x) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length-(k-1); i++) {
            add(nums,i,i+(k-1),list,k,x);
        }

        int[] ans = new int[list.size()];
        int i=0;
        for (int num : list
             ) {
            ans[i] = num;
            i++;
        }

        return ans;

    }

    static void add(int[] arr,int s,int e, ArrayList<Integer> list,int k,int x){

        int[] ar = new int[k];
        int j = 0;
        for (int i = s; i <= e; i++) {
            ar[j] = arr[i];
            j++;
        }

        Arrays.sort(ar);
        list.add(ar[x-1]);
    }
}
