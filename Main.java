
import java.util.*;

class Main{

    public static void main(String[] args){

        int n = 16;
        int x ;

        x = findpivot1(n);
        int y = getsum(n);
        System.out.println(x);
    }

    private static int findpivot1(int n) {
        int ans = -1;

        for(int i=0; i<n;i++){
            int s1 = getsum1(i);
            int s2 = getsum1(n) - getsum(i-1);
            if(s1 == s2)
                return i;
        }
        return ans;
    }

    private static int getsum1(int i) {
        return i*(i+1)/2;
    }

    private static int getsum(int n) {
        return n*(n+1)/2;
    }

    //we are dividing the array in two parts and checking the sum of each
// for right side we are using for loop of j
// and for left side we are using farmula n*(n+1)/2
    private static int findpivot(int n) {
        for(int i = 0;i<n; i++){
            int totalSum =0;

            for(int j=i; j<=n;j++){
                totalSum = totalSum + j;
            }
            if(totalSum == i*(i+1)/2)
                return i;
        }
        return -1;
    }
}