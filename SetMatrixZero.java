import java.util.HashSet;
import java.util.Set;

public class SetMatrixZero {
    public static void main(String[] args){

        int[][] arr = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };

        setZeroes(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
    static void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<Integer>();
        Set<Integer> cols = new HashSet<Integer>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0){
                   rows.add(i);
                   cols.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (rows.contains(i) || cols.contains(j))
                    matrix[i][j] = 0;
            }
        }
    }


}
