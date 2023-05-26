import java.util.*;

public class PermutationReturn {
    public static void main(String[] args){

        List<List<Integer>> list = new ArrayList<>();
        int[] arr = {1,2,3};
        list = findPremutations(arr);
        System.out.println(list);
        list.remove(list.size()-1);
        System.out.println(list);
    }

    static List<List<Integer>> findPremutations(int[] nums){

        List<List<Integer>> list = new ArrayList<>();
        backTrack(list,new ArrayList<>(),nums);
        return list;
    }

    static void backTrack(List<List<Integer>> list,List<Integer> tempList,int[] nums){

        if (tempList.size() == nums.length){

                list.add(new ArrayList(tempList));
        }
        for (int num : nums) {
            if (tempList.contains(num)) {
                continue;
            }

            tempList.add(num);
            backTrack(list, tempList, nums);
            tempList.remove(tempList.size() - 1);

        }
    }
}
