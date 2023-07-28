package College;

import java.util.ArrayList;

public class MatrixReshape {
    public static void main(String[] args) {
        int[][] matrix = {{1,2},{3,4}};
        int r = 1;
        int c = 4;

        int[][] ans = new int[r][c];

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                list.add(matrix[i][j]);
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0,k=0; j < c; j++,k++) {
                ans[i][j] = list.get(k);
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println(ans[i][j]);
            }

        }
    }
}
