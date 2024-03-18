package College;

import java.util.Arrays;



import java.util.Arrays;

public class FindAns {
    static int solution(int[] A, int[] B) {
        int N = A.length;
        // Create a DP table to store the minimum of the maximum values encountered up to each cell.
        int[][] dp = new int[2][N];
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        dp[0][0] = A[0];

        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < N; ++j) {
                if (i == 0 && j == 0) continue; // Skip the starting cell

                int fromLeft = Integer.MAX_VALUE, fromTop = Integer.MAX_VALUE;
                if (j > 0) fromLeft = Math.max(dp[i][j-1], (i == 0 ? A[j] : B[j]));
                if (i > 0) fromTop = Math.max(dp[i-1][j], B[j]);

                dp[i][j] = Math.min(fromLeft, fromTop);
            }
        }

        return dp[1][N-1];
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 1, 1, 1, 4};
        int[] b = {1, 1, 1, 3, 1, 1};

        System.out.println(solution(a,b));
    }
}

