import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SubsetOfArray {
    public static void main(String []args){

        int[] arr = {11,2,19,7,9,27};
        List<List<Integer>> ans = subset(arr);
        //List<List<Integer>> ans = subsetWithoutDuplicate(arr);

        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }

    static  List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());


        for(int num : arr){
            int n = outer.size();
            for(int i = 0; i < n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }



    static  List<List<Integer>> subsetWithoutDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int start;
        int end = 0;

       for(int i = 0; i<arr.length;i++){
           start = 0;
           if(i>0 && arr[i] == arr[i-1]){
               start = end+1;
           }
           end = outer.size()-1;


            int n = outer.size();
            for(int j = start; j < n; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
