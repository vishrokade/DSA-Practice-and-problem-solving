package College;

import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.List;

public class AddOpeators {
    public static void main(String[] args) {
        String nums = "123";
        int target = 6;
    }
    static List<String> findAns(String nums, int t){

        List<String> list = new ArrayList<>();
        List<String> ans = backTrack(nums,t,0,0,list);
        return ans;
    }
    static List<String> backTrack(String nums,int t,int index,int sum ,List<String> list){

        if (index == nums.length()){
            if (sum == t){
                return list;
            }
        }

        return list;
    }
}
