package College;

import java.util.HashMap;
import java.util.Map;

public class MinimumSum {
    public static void main(String[] args) {
        int n = 3; int k = 5;

        int sum=0;
        Map<Integer,Integer> nm=new HashMap<>();
        for(int i=1;nm.size()<n;i++)
        {
            if(!nm.containsKey(k-i))
            {
                sum+=i;
                nm.put(i,1);
            }
            System.out.println(nm);
        }
        System.out.println(sum);


    }
}
