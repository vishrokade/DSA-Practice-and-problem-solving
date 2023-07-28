package College;

public class Diagonalsum {
    public static void main(String[] args) {
        int matrix[][] = {{1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}};

        int ans = 0;
        int i = 0,j=0;
        while (i<matrix.length){
            ans = ans + matrix[i][j];
            i++;
            j++;
        }
        i=0;
        j=matrix.length-1;
        while (i<matrix.length){
            ans = ans + matrix[i][j];
            i++;
            j--;
        }

        if (matrix.length%2==1){
            int mid = matrix.length/2;
            ans = ans - matrix[mid][mid];
            System.out.println(ans);

        }
        else {
            System.out.println(ans);
        }
    }
}
