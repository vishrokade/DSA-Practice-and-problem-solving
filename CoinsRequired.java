import java.util.Arrays;

public class CoinsRequired {
    public static void main(String[] args) {
        int target = 7;
        int arr[] = {1,2,3};

        int ans = totalWaystoTarget(arr,target,0);
        //System.out.println(ans);

        //System.out.println(minimumCoins(arr,target));
        System.out.println(findMinCoinCombination(arr,target));

//        String s= "";
//        System.out.println(s+2);
    }

    static int totalWaystoTarget(int[] nums,int t,int index){
        if (t == 0){
            return 1;
        }

        if (t < 0 || index >= nums.length){
            return 0;
        }

       int include = totalWaystoTarget(nums,t-nums[index],index);

        int exclude = totalWaystoTarget(nums,t,index+1);

        return include+exclude;
    }

    static int minimumCoins(int[] nums,int t){
        if (t == 0){
            return 0;
        }

        if (t < 0){
            return Integer.MAX_VALUE;
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
         int ans = minimumCoins(nums,t-nums[i]);

         if (ans != Integer.MAX_VALUE){
             min = Math.min(1+ans,min);
         }
        }
        return min;
    }

    static int findMinCoinCombination(int[] coins, int target) {
        int[] minCoins = new int[target + 1];
        Arrays.fill(minCoins, Integer.MAX_VALUE);
        minCoins[0] = 0;

        for (int i = 1; i <= target; i++) {
            for (int coin : coins) {
                if (i >= coin && minCoins[i - coin] != Integer.MAX_VALUE) {
                    minCoins[i] = Math.min(minCoins[i], minCoins[i - coin] + 1);
                }
            }
        }

        return minCoins[target];
    }
}
