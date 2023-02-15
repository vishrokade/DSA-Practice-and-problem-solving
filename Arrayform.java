import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arrayform {
    public static void main(String[] args){

        int[] num = { 1,2,0,0};
        System.out.println(arryform(num,34));
    }
    static List<Integer> arryform(int[] num,int k){
        List list = new ArrayList();

        String s ="";
        for (int i = 0; i < num.length; i++) {
            s+=num[i];
        }
        Long j = Long.parseLong(s);
        Long ans = j+k;


        while (ans != 0){
            Long rem = ans % 10;
            ans = ans/10;
            list.add(rem);
        }

        int start = 0;
        int end = list.size()-1;

//        while (start<end){
//            int temp = (int) list.get(start);
//            list.set(start,list.get(end));
//            list.set(end,temp);
//            start++;
//            end--;
//        }
        Collections.reverse(list);
        return list;

        /*
        final LinkedList result = new LinkedList<>();
int len = num.length - 1;

    while(len >= 0 || k != 0){

        if(len >= 0){
            k += num[len--];
        }

        result.addFirst(k % 10);
        k /= 10;
    }

    return result;
         */
    }
}
