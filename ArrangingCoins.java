public class ArrangingCoins {
    public static void main(String[] args){
        int n = 105;
        System.out.println(arrangeCoins(n));
    }

    static int arrangeCoins(int n) {
        int x = n;
        long count = 1;
        for(int i = 1; i < n; i++){
            x = x - i;

            if(x >= i+1){
                count++;
            }
        }

        return (int)count;


        /*long left = 0, right = n;
        long k, curr;
        while (left <= right) {
            k = left + (right - left) / 2;
            curr = k * (k + 1) / 2;

            if (curr == n) return (int)k;

            if (n < curr) {
                right = k - 1;
            } else {
                left = k + 1;
            }
        }
        return (int)right;

         */
    }
}
