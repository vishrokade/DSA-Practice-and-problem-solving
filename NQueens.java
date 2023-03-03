public class NQueens {
    public static void main(String[] args){

        int n = 4;
        boolean[][] board = new boolean[n][n];
        //System.out.println(queens(board,0));
        queens(board,0);
    }

    static int queens(boolean[][] board, int row){  //every time column is starting from the 0 hence we are not passing it
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;

        for (int col = 0; col < board.length; col++){

            if(isSafe(board,row,col)){
                board[row][col] = true;
                count = count + queens(board,row+1);
                board[row][col] = false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row,int col){
        //check till current row only coz we have placed queens before that only
        // and there is already an queen there then the place will not be safe

        for (int i = 0; i < row; i++) {
            if(board[i][col] == true){
                return false;
            }
        }

        int DigonalLeft = Math.min(row,col);
        for (int i = 1; i <= DigonalLeft; i++) {
            if (board[row - 1][col - 1]){
                return false;
            }
        }

        int DigonalRight = Math.min(row,board.length - col - 1);
        for (int i = 1; i <= DigonalRight; i++) {
            if(board[row - 1][col + 1]){
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] board){

        for(boolean[] row : board){
            for(boolean element : row){
                if (element){
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
