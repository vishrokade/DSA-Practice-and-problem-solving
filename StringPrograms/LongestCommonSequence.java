//https://leetcode.com/problems/longest-common-subsequence/submissions/908489525/
package StringPrograms;

import java.util.Arrays;

public class LongestCommonSequence {

    static int[][]  dp  = new int[1001][1001]; //declared globally no need to pass in function as parameter
    public static void main(String[] args) {
        String a = "abcde";
        String b = "ace";


        System.out.println(find(a,b));
    }

    static int find(String a,String b){
        for (int[] i: dp) {
            Arrays.fill(i,-1);
        }
        return solve(a,b,0,0);
    }

    static int solve(String a, String b , int i, int j){
        if (i == a.length()){
            return 0;
        }
        if (j == b.length()){
            return 0;
        }

        if (dp[i][j] != -1){
            return dp[i][j];
        }

        if (a.charAt(i) == b.charAt(j)){
            return  1 + solve(a,b,i+1,j+1);
        }

            return dp[i][j] = Math.max(solve(a,b,i+1,j),solve(a,b,i,j+1));


    }
}
