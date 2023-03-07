import java.util.Arrays;

public class arrOperations {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        System.out.println(Arrays.toString(arr));

        delete(arr,2);

        System.out.println(Arrays.toString(arr));
    }

    static void delete(int[] arr, int index){
        for (int i = index; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
    }

    static void deleteEle(int[] arr, int ele){
        int index = 0;
        while (arr[index] != ele){
            index++;
        }

        for (int j = index; j < arr.length-1; j++) {
            arr[j] = arr[j+1];
        }
        arr[arr.length-1] = 0;
    }
}
