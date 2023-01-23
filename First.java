import java.util.ArrayList;
import java.util.List;

public class First {
    public static void main(String[] args){
        int[] arr = {1,4,7,8,5};

        System.out.println(find(arr));
    }

    private static int find(int[] arr) {

        List<Integer> list = new ArrayList<>();

        if (arr[0] == arr[arr.length-1]){
            arr[1] = arr[0];
            arr[2] = arr[0];
        }

        if (arr[0] < arr[arr.length-1]){
            arr[0] = arr[arr.length-1]+1;
            arr[1] =  arr[arr.length-1]+1;
        }

        for (int i = 0; i < arr.length-1; i++) {

            for (int j = i+1; j < arr.length; j++) {

                list.add(Math.abs(arr[i]-arr[j]));
            }

        }

        int x = list.get(0) + list.get(list.size()-1);
        return x;
    }
}
