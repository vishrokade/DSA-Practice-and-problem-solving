import java.util.Arrays;

public class SortStudents {
    public static void main(String[] args){
        int[][] arr = {{10,6,9,1},{7,5,11,2},{4,8,3,15}};


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(arr[i][j]);
            }


        }
       // int[][] ar2 = find(arr,2);
    }

    static int[][] find(int[][] arr,int k){
        Arrays.sort(arr);


        return arr;
    }
}
