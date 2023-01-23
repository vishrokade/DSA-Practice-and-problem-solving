import java.util.Arrays;

public class CountPsAndNeg {
    public static void main(String[] args){

        int[] arr = {-1,-2,-3,0,4,5,6,7,8};
        System.out.println(find(arr));

    }

    static int find(int[] arr){

        int pos = 0;
        int neg = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                pos++;
            }
            if (arr[i] < 0){
                neg++;
            }
        }

        if (pos > neg){
            return pos;
        }
        return neg;
    }
}
