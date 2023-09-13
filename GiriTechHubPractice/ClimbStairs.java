package GiriTechHubPractice;
//find the total ways to climb the stairs
// you can climb one stair at a time or two

public class ClimbStairs {
    public static void main(String[] args) {
        //int ans = findways(10,0);
        //int ans = findwaysWithdp(10);
        int stairs = 10;
        int[] dp = new int[stairs+1];
        int ans = dpwithRec(stairs,0,dp);
        System.out.println(ans);
    }

    static int findways(int stairs, int i){
        if (stairs == i){
            return 1;
        }
        if (stairs < i){
            return 0;
        }
        int ans = findways(stairs,i+1) + findways(stairs,i+2);
        return ans;
    }

    static int findwaysWithdp(int stairs){
        int ans = 0;

        int dp[] = new int[stairs+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= stairs; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[stairs];
    }

    static int dpwithRec(int stairs,int i , int[] dp){
        if (stairs == i){
            return 1;
        }
        if (stairs < i){
            return 0;
        }

        if (dp[i] != 0){
            return dp[i];
        }

        dp[i] = dpwithRec(stairs,i+1,dp) + dpwithRec(stairs,i+2,dp);
        return dp[i];
    }
}
