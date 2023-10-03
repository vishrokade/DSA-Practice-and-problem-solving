import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GridPathFinding {
    public static void main(String[] args) {
        int[][] grid = {{1,2,3},{4,5,6}};
//        ArrayList<Integer> list = new ArrayList<>();
//        findallPath(grid,0,0,"",grid[0][0],list);
//        int min = Collections.min(list);
//        System.out.println(min);

        int ans = recPathSum(grid);
        System.out.println(ans);
    }

    static void findallPath(int[][] grid, int i, int j, String s, int sum, List<Integer> list){
        if (i == grid.length-1 && j == grid[0].length-1){
            System.out.println(s);
            System.out.println(sum);
            list.add(sum);
        }

        if (i < grid.length-1){
             findallPath(grid,i+1,j,s+'D',sum + grid[i+1][j],list);
        }

        if (j < grid[0].length-1){
            findallPath(grid,i,j+1,s+'R',sum + grid[i][j+1],list);
        }
    }

     static int recPathSum(int[][] cost) {
        int m = cost.length - 1, n = cost[0].length - 1, curr_Sum = 0;

        return helper(cost, m, n);
    }

     static int helper(int[][] cost, int m, int n) {
        if (m == 0 && n == 0) {
            return cost[0][0];
        } else if (m == 0) {
            return cost[0][n] + helper(cost, 0, n - 1);
        } else if (n == 0) {
            return cost[m][0] + helper(cost, m - 1, 0);
        }
        return cost[m][n] + Math.min(helper(cost, m, n - 1),
                helper(cost, m - 1, n));
    }
}
