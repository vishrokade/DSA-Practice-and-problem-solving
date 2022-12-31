import java.util.ArrayList;

public class MazeProblem {
    public static void main(String []args){

        System.out.println(maze(3,3));
        mazePath("",3,3);

        System.out.println(mazePathRet("",3,3));

        System.out.println(mazeDiagonal("",3,3));

    }

    static int maze(int row, int col){
        if(row == 1 || col == 1){
            return 1;
        }

        int left =  maze(row-1,col);
        int right = maze(row,col-1);

        return left + right;
    }

    static void mazePath(String p ,int row, int col){
        if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }

        if(row > 1){
            mazePath(p+'D',row-1,col);
        }
        if(col>1){
            mazePath(p+'R',row,col-1);
        }
    }

    static ArrayList<String> mazePathRet(String p,int row,int col) {
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if (row > 1){
            list.addAll(mazePathRet(p+'D',row-1,col));
        }
        if (col > 1) {
            list.addAll(mazePathRet(p+'R',row,col-1));
        }

        return list;
    }

    static ArrayList<String> mazeDiagonal(String p,int row,int col) {
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if (row > 1){
            list.addAll(mazeDiagonal(p+'D',row-1,col));
        }
        if (col > 1) {
            list.addAll(mazeDiagonal(p+'R',row,col-1));
        }
        if (col > 1 && row > 1) {
            list.addAll(mazeDiagonal(p+'d',row-1,col-1));
        }

        return list;
    }
}
