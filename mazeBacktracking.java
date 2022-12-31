import java.util.Arrays;

public class mazeBacktracking {
    public static void main(String[] args){

        boolean[][] maze =  {
                {true,true,true},
                {true,false,true},
                {true,true,true} //when recursion call have the values of row and column equals to 1,1 then return from the  recursion call
        };

        boolean[][] allPath = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] arr = new int[allPath.length][allPath[0].length];
        printAllPath("",allPath,0,0,arr,1);

        //mazeAllPath("",allPath,0,0);
       // mazePathObstacle("",maze,0,0);
    }
    static void mazePathObstacle(String p ,boolean[][] maze ,int row, int col){
        if(row == maze.length -1 && col == maze[0].length -1){
            System.out.println(p);
            return;
        }

        if(!maze[row][col]){
            return;
        }

        if(row < maze.length -1 ){
            mazePathObstacle(p+'D',maze,row+1,col);
        }
        if(col < maze[0].length -1){
            mazePathObstacle(p+'R',maze,row,col+1);
        }
    }
    static void mazeAllPath(String p ,boolean[][] maze ,int row, int col){
        if(row == maze.length -1 && col == maze[0].length -1){
            System.out.println(p);
            return;
        }

        if(!maze[row][col]){
            return;
        }

        // I am going the function call so I am declaring that this block is visited
        maze[row][col] = false;

        if(row < maze.length -1 ){
            mazeAllPath(p+'D',maze,row+1,col);
        }
        if(col < maze[0].length -1){
            mazeAllPath(p+'R',maze,row,col+1);
        }
        if(row > 0){
            mazeAllPath(p+ 'U',maze,row-1,col);
        }

        if (col > 0){
            mazeAllPath(p+'L',maze,row,col-1);
        }

        //after completion of the recursion call restoring the changes whatever made while going in the function call
        //before the function gets removed, remove the changes that were made by that function

        maze[row][col] = true;

    }

    static void printAllPath(String p, boolean[][] maze, int row, int col, int[][] path,int step){
        if(row == maze.length-1 && col == maze[0].length -1){
            path[row][col] = step;
            for (int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[row][col]){
            return;
        }

        maze[row][col] = false;
        path[row][col] = step;

        if(row < maze.length-1){
            printAllPath(p+ "D",maze,row+1,col,path,step+1);
        }

        if(col < maze[0].length -1){
            printAllPath(p+'R',maze,row,col+1,path,step+1);
        }
        if(row > 0){
            printAllPath(p+ 'U',maze,row-1,col,path,step+1);
        }

        if (col > 0){
            printAllPath(p+'L',maze,row,col-1,path,step+1);
        }

        maze[row][col] = true;
        path[row][col] = 0;
    }
}
