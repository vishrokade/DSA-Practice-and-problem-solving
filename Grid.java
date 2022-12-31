import java.util.Arrays;

public class Grid {
    public static void main(String[] args){

        int[][] arr = {{1, 2, 3},
                {4,5,6}};

       //int a = gridS(arr);
       //System.out.println(a);
        print(arr);
    }
    static int gridS(int[][] grid){

        int m = grid.length;
        int n = grid[0].length;

        for(int i = 0;i<m;i++){
            Arrays.sort(grid[i]);
        }
        int ans = 0;
        for(int i = 0; i<n;i++){
            int max = 0;
            for(int j = 0;j<m;j++){
                max = Math.max(max,grid[j][i]);
            }
            ans = ans+max;
        }
        return ans;
    }

    static void print(int[][] arr){
      /*  int i = 0;
        int j = 0;
        //System.out.println(arr[0].length);
        while(j <arr[0].length) {
            while (i < arr.length) {
                //System.out.println(arr[i][j]);
                i++;
            }
            j++;
            i=0;
        }

        for(int l = 0; l <arr.length; l++){
            for(int k = 0; k<arr[l].length;k++){
                //System.out.println(arr[k][l]);
            }
        }


       */
        for(int row = 0; row < arr.length;row++){
            for(int col = 0; col < arr[0].length; col++){
                System.out.print(arr[col][row]+" ");
            }
            System.out.println();
        }

        for(int row = 0; row < arr.length;row++){
            for(int col = 0; col < arr[0].length; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }



    }

}
