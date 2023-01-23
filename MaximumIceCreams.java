import java.util.Arrays;

public class MaximumIceCreams {
    public static void main(String[] args){

        int[] arr = {1,2,3,4,1};
        int cost = 7;

        System.out.println(findcost(arr,cost));

    }
    static int findcost(int[] arr,int cost){
        Arrays.sort(arr);

        int count = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] <= cost){
                sum = sum + arr[i];
                cost = cost - arr[i];
                count++;
            }
        }
        return count;
    }

}
