package College;

import java.util.Arrays;

public class Selection {


    public static void main(String[] args){

        int[] arr = {5,3,7,32,11,54,9,1};
        //sort(arr);
        int n = arr.length;
        selectioRec(arr,n,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){

        for(int i = 0; i<arr.length; i++){

            int last = arr.length-i-1;
            int max = getmax(arr,0,arr.length-i-1);
            swap(arr, max,last);
        }
    }
    private static int getmax(int[] arr, int start, int end) {

        int max = start;

        for(int i=0 ; i < end; i++){

            if(arr[i] > arr[max]){

                max = i;
            }
        }
        return max ;
    }
    static void swap(int[] arr , int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void selectioRec(int[] arr, int row, int col, int max){

        if(row == 0){
            return ;
        }

        if(col < row){
            if(arr[col] > arr[max]){
                selectioRec(arr,row,col+1,col);
            }
            else {
                selectioRec(arr,row,col+1,max);
            }
        }
        else {
            int temp = arr[max];
            arr[max] = arr[row-1];
            arr[row-1] = temp;
            selectioRec(arr,row-1,0,0);
        }
    }

}
