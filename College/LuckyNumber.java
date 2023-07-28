package College;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumber {
    public static void main(String[] args) {
        int matrix[][] = {{3,7,8},{9,11,13},{15,16,17}};

        int mat[][] = {{10,20,15},{21,30,14},{7,16,32}};
        int[] ans1 = new int[2];
        List<Integer> ans = new ArrayList<>();


//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (isMax(matrix[i][j],matrix,i) && isMin(matrix[i][j],matrix,j)) {
//
//                    ans.add(matrix[i][j]);
//                }
//            }
//        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (isMax(mat[i][j],mat,i) && isMin(mat[i][j],mat,j)) {

                    ans1[0] = i;
                    ans1[1] = j;
                }
            }
        }

        System.out.println(Arrays.toString(ans1));
    }

    static boolean isMax(int no, int[][] matrix,int row){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < matrix[row].length; i++) {
            if (matrix[row][i] < min){
                min = matrix[row][i];
            }
        }
        if (min == no){
            return true;
        }
        return false;
    }

    static boolean isMin(int no, int[][] matrix,int col){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][col] > max){
                max = matrix[i][col];
            }
        }

        if (max == no){
            return true;
        }
        return false;
    }
}
