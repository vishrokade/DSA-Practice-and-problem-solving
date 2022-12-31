package recursion;

public class countDigitOne {
    public static void main(String[] args){
        System.out.println(countDigitOne(824883294));
    }

    static int countDigitOne(int n) {
        int total = 0;
        for(int i = 0; i<=n; i++){
            total = total + chechforone(i);
        }
        return total;
    }
    static int chechforone(int i){
        return helper(i,0);
    }

    static int helper(int i, int c){
        if(i == 0){
            return c;
        }
        int rem = i % 10;
        if(rem == 1){
            return helper(i/10,c+1);
        }
        return helper(i/10, c);
    }
}
