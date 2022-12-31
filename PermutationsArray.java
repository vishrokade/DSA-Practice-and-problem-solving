import java.util.Arrays;

public class PermutationsArray {

    public static void main(String[] abc){

        int[] arr = {1,2,3};
        permutations(arr,0);
    }

    static void permutations(int[] arr,int startIndex)
    {
        if (startIndex == arr.length-1){
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = startIndex; i < arr.length; i++) {

            swap(arr,i,startIndex);
            permutations(arr,startIndex+1);
            swap(arr,i,startIndex);

        }
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
