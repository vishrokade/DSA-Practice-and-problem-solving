import java.util.Arrays;

public class ColdWormHot {
    public static void main(String[] args){

        int[] arr = {1,4,2};
        System.out.println(find(arr));
    }

    static int find(int[] arr){

        int count =0;

        Arrays.sort(arr);

        while (arr[1] > 0 || arr[2] > 0){
            arr[1]--;
            arr[2]--;
            count++;
            Arrays.sort(arr);
        }

        return count;
    }
}
