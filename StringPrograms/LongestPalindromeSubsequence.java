package StringPrograms;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class LongestPalindromeSubsequence {
    static int[][] dp = new int[1001][1001];
    public static void main(String[] args) {
       String s = "bbbab";

        System.out.println(find(s));
    }

    static int find(String s){

        StringBuilder s1 = new StringBuilder(s);
        String s2 = String.valueOf(s1.reverse());
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }

        return solve(s, s2,0,0);
    }

    static int solve(String a, String b,int i, int j){
        if (i == a.length() || j == b.length()){
            return 0;
        }
        if (dp[i][j] != -1){
            return dp[i][j];
        }

        if (a.charAt(i) == b.charAt(j)){
            return 1 + solve(a,b,i+1,j+1);
        }

        return dp[i][j] = Math.max(solve(a,b,i+1,j),solve(a,b,i,j+1));
    }
}
