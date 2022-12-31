public class Climbstairs {
    public static void main(String []args){

        int n = helper(4);
       // System.out.println(n);

        int digit = 2;
        String str = new String("23");
        int x  = str.charAt(0) - '0';
        System.out.println(x);
    }

    static int helper(int no){
        int prev1=1;
        int prev2=1;
        for(int i=2;i<=no;i++){
            int curr_i=prev1+prev2;
            prev2=prev1;
            prev1=curr_i;
        }
        return prev1;
    }
}
