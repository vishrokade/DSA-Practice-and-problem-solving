import java.util.Scanner;
public class CountOnes {
    public static int countOnes(int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            String binary = Integer.toBinaryString(i);

            for (char c : binary.toCharArray()) {
                if (c == '1') {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        int N = abc.nextInt();
        int onesCount = countOnes(N);
        System.out.println("Number of ones up to " + N + ": " + onesCount);
     }
}