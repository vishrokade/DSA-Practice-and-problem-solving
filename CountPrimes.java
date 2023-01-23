public class CountPrimes {
    public static void main(String[] ars){

        System.out.println(find(10));

    }

    static int find(int n){

      /*  if (n == 0 ||n == 1){
            return 0;
        }
        int count = 0;
        for (int i = 2; i < n; i++) {

            if (isPrime(i)){
                count++;
            }
        }
        return count;

       */
        boolean[] notPrime = new boolean[n];

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!notPrime[i]) {
                count++;
                for (int j = 2; i*j < n; j++) {
                    notPrime[i*j] = true;
                }
            }
        }

        return count;
    }
    static boolean isPrime(int i) {
        int mid = i/2;
        for (int j = 2; j <= mid; j++) {
            if (i % j == 0){
                return false;
            }
        }
        return true;
    }
}
