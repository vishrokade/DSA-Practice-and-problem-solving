//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/
public class CapacityOfShips {
    public static void main(String[] args){
        int[] arr = {3,2,2,4,1,4};
        int days = 3;

        System.out.println(capacity(arr,days));

      //  System.out.println(fact(20));

    }
    static int capacity(int[] arr,int days){

        int max= 0;
        int sum =0;
        int ans=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
            sum += arr[i];
        }

        int low = max,high=sum;

        while (low <= high){

            int mid = (low+high)/2;

            if(helper(mid, arr, days) == true){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }

    static boolean helper(int mid, int[] arr, int days){

        int sum = 0;
        int d = 1;

        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] <= mid){
                sum = sum + arr[i];
            }
            else {
                sum=arr[i];
                d++;
            }
        }
        if (d <= days){
            return true;
        }
        return false;
    }
    static long fact(int n){
        if (n<2){
            return n;
        }

        return n * fact(n-1);
    }
}
