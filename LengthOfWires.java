public class LengthOfWires {

    public static void main(String[] args){

    }

    public int wire(int[] arr,int n){

        int result = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int ans = 0;
            for (int j = 0; j < n; j++) {

                ans = ans + Math.abs(arr[i] - arr[j]);

            }

            if (ans < result){
                result = ans;
            }

        }

        return result;
    }
}
