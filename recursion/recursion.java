package recursion;

import java.util.Scanner;

public class recursion {
    public static void main(String[] args){

        //printnofrom(6);

        int facto = fact(5);
       // System.out.println(facto);
         System.out.println(sumofdigit(1234));

         /*
        Scanner no = new Scanner(System.in);
        System.out.println("Enter the number to find the sum of digits");

        int number = no.nextInt();
        System.out.println(sum(number));
*/
    }

    static void printnofrom(int val){
        if (val == 0) {
            return;
        }

        printnofrom(val-1);
        System.out.println(val);

    }

    static int fact(int no){
        if(no == 1){
            return 1;
        }

        int fact = no * fact(no - 1);
        return fact;
    }

    static int sumofdigit(int n){
        if (n == 0){
            return 0;
        }

        int rem = n % 10;
        //System.out.println(rem);
       return  rem + sumofdigit(n/10) ;

    }

    static int sum(int no){
        if(no < 10){
            return no;
        }
        int rem = 0;
        int sum = 0;
       while(no != 0) {
           rem = no % 10 ;

           no = no / 10;
           sum = sum + rem;
       }
       return sum;

    }
}
