import java.util.Arrays;

public class mergeArray {
    public static void main(String[] args){
        int[] arr1 = {11,33,44,55,66};
        int[] arr2 = {6,7,8,9};

        int[] arr3 = new int[arr1.length+arr2.length];

        /*for(int i = 0; i< arr3.length; i++){
           if(arr1[i] > arr2[i]){
               arr3[i] = arr2[i];
           }
           else {
               arr3[i] = arr1[i];
           }
        }*/

       int i= 0;
       int j = 0;
       int k = 0;

       while(i < arr1.length && j < arr2.length){

           if(arr1[i] < arr2[j]){
               arr3[k] = arr1[i];
               k++;
               i++;
           }
           else{
               arr3[k] = arr2[j];
               k++;
               j++;
           }
       }

       while( i < arr1.length){
           arr3[k] = arr1[i];
           i++;
           k++;
       }
       while( j < arr2.length){
           arr3[k] = arr2[j];
           j++;
           k++;
       }

        System.out.print(Arrays.toString(arr3));
    }
}
