package recursion;

public class reversedigits {
    static int sum;
    public static void main(String[] args) {
        int no = 1;
        reverse(no);
        System.out.println(sum);
        if (sum == no){
            System.out.println("palindrome");
        }
        else {
            System.out.println(" not palindrome");
        }
    }
   static void reverse(int no){
        if(no == 0){
            return;
        }
        int rem = no % 10;
        sum = sum * 10 + rem;
        //System.out.print(rem);
         reverse(no / 10);
   }
}
