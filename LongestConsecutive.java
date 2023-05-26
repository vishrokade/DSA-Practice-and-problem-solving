import java.util.*;

public class LongestConsecutive {

    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};

        int n = find(arr);
        System.out.println(n);
    }
    static int find(int[] arr){

//        int count=0; // first solution Not accepted on the leetcode coz of taking more time to run
//        HashSet<Integer> h = new HashSet<>();
//        for (int i = 0; i < arr.length; i++) {
//            h.add(arr[i]);
//        }
//        for (int i = 0; i < arr.length; i++) {
//            int j = arr[i];
//            int temp = 0;
//            while (h.contains(j)){
//                temp++;
//                j++;
//            }
//            count = Math.max(temp,count);
//        }

        // second solution
        if(arr.length==0) return 0;
        int count = 0;
        int temp =1;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]+1  == arr[i+1]){
                temp++;
                count = Math.max(temp,count);
            } else if (arr[i]  == arr[i+1]) {
                continue;
            }
            else {
                temp = 1;
            }
        }
     return count;
    }
}
