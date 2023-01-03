import java.util.HashSet;
import java.util.Set;

public class PrimeFactorsofProduct {
    public static void main(String[] args){

        int[] nums = {2,3,5,7,9,11};
        System.out.println(findCount(nums));
    }

    static int findCount(int[] nums){

        HashSet<Integer> count = new HashSet<>();

        for (int num : nums) {
            primeFactors(num, count);

        }
        return count.size();
    }

    static void primeFactors(int n,HashSet<Integer> count){
        while (n % 2 == 0){
            count.add(2);
            n=n/2;
        }

        for (int i = 3; i < Math.sqrt(n); i++) {
            while (n % i == 0){
                count.add(i);
                n = n / i;
            }

        }
        if (n > 2){
            count.add(n);
        }
    }
}
