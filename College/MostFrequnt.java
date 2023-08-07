package College;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MostFrequnt {
    public static void main(String[] args) {

        int[] nums = {1,1,1,1,2,2,3};
        int k = 2;

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else {
                int currentValue = map.get(nums[i]);
                int updatedValue = currentValue + 1;
                map.put(nums[i], updatedValue);
            }
        }

        int arr[] = new int[k];
        int j = 0;
        for(int i = 0 ; i< k ;i++){
            int freq = 0;
            int max = 0;
            for(Map.Entry<Integer,Integer> val : map.entrySet()){
                if(val.getValue() > freq){
                    freq = val.getValue();
                    max = val.getKey();
                }
            }
            map.put(max,0);
            arr[j] = max;
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
