package recursion;

public class checkzeros {
    static int count;
    public static void main(String args[]){

         check(0);
       // System.out.println(count);
   /* int no =0;
    int c = 0;
    while(no != 0){
        int rem = no% 10;
        if(rem == 0){
            c++;
        }
        no = no / 10;
    }
    System.out.println(c);*/

        System.out.println(chechze(700008));
    }
    static void check(int num){
        if(num == 0){
            return;
        }
        int rem = num % 10;
        if(rem == 0){
            count++;
        }
        num = num /10;
        check(num);
    }

    static int chechze(int no){
        if(no == 0){
            return 1;
        }
       return helper(no,0);
    }
    static int helper(int n , int c){
        if(n == 0){
            return c;
        }
        int rem = n % 10;
        if(rem==0){
            c++;
        }
        return helper(n/10,c);
    }
}
