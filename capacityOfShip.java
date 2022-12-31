public class capacityOfShip {
    public static void main(String []args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int d = 5;
        int ans = shipWithinDays(arr,d);

        System.out.println(ans);
    }
    static int shipWithinDays(int[] weights, int days) {

        int max = 0;
        int sum = 0;
        int n = weights.length;

        for(int i = 0; i < n; i++){
            if(max < weights[i]){
                max = weights[i];

            }
            sum += weights[i];
        }

        int low = max;
        int high = sum;

        int ans = 0;

        while(low <= high){
            int mid = (low + high) / 2;

            if(helper(mid, weights, days) == true){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return ans;

    }

    static boolean helper(int mid, int[] arr,int days){
        int sum = 0;
        int d = 1;
        for(int i = 0; i < arr.length;i++){
            if(sum+arr[i] <= mid){
                sum = sum + arr[i];
            }
            else{
                sum = arr[i];
                d++;
            }
        }

        if(d <= days)
            return true;

        return false;
    }
}
