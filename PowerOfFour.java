public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(21));
    }
    static boolean isPowerOfFour(int n) {
        if(n <= 0){
            return false;
        }

        while(n > 1){
            if(n % 3 != 0){
                return false;
            }
            n/=3;
        }

        return n == 1;
    }
}
