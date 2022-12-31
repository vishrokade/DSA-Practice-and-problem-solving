import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args){
        int[] arr = {3,7,4,8,9,2,12,1};

        //sort(arr);

        int n = arr.length-1;
        sortRec(arr,n,0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {

        for(int i = 0; i<arr.length; i++){

            for(int j = 1; j< arr.length-i; j++){

                if(arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    static void sortRec(int[] arr, int row, int col){

        if(row == 0){
            return;
        }
        if(col < row){

            if(arr[col] > arr[col+1]){
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] =temp;
            }
            sortRec(arr,row,col+1);
        }
        else {
            sortRec(arr,row-1,0);
        }
    }
}
