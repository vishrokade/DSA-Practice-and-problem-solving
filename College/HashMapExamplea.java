package College;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class HashMapExamplea {

    public static void main(String[] args) {
//        int[] nums = {1,3,1,2,2};
//        int count = 0;
//
//        HashSet<Integer> set = new HashSet<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            if (!set.contains(nums[i])){
//                set.add(nums[i]);
//            }
//        }
//
//        System.out.println(set.size());
//
//        List<List<Integer>> subArrays = findAllSubarrays(nums);
//
//        for (List<Integer> subarray : subArrays) {
//            System.out.println(subarray);
//        }
//
//        for (List<Integer> subarray: subArrays
//             ) {
//            if (subarray.size() >= set.size()){
//
//                if (allPresent(set,subarray) == true){
//                    count++;
//                }
//            }
//        }
//
//        System.out.println("subarray count"+count);

        String str = "vishal";
        System.out.println(str.substring(1,4));
    }

    static List<List<Integer>> findAllSubarrays(int[] arr) {
        List<List<Integer>> subarrays = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                List<Integer> subarray = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    subarray.add(arr[k]);
                }
                subarrays.add(subarray);
            }
        }

        return subarrays;
    }

    static boolean allPresent(HashSet<Integer> set,List<Integer> subarray){

        for (Integer num : set) {
            if (!subarray.contains(num)) {
                return false;
            }
        }
        return true;
    }
}
