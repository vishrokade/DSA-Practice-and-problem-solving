import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findPrimesBetween {
    public static void main(String[] args){
        int left = 19;
        int right = 31;
        int[] arr = findprime(left,right);
        System.out.println(Arrays.toString(arr));
    }
    static boolean find(int no){
        int i,m=0;
        m=no/2;
        if(no==0||no==1){
            return false;
        }else{
            for(i=2;i<=m;i++){
                if(no%i==0){
                    return false;
                }
            }
        }
        return true;
    }

    private static int[] findprime(int left, int right) {

        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {

            if (find(i) && list.size()<2){
                list.add(i);
            }
        }
        if (list.size() < 2){
            return new int[]{-1, -1};
        }
        int[] arr = new int[2];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
