package DAA;
public class FibonacciNonRecursive {
    public static long calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        long fib = 0;
        long prev1 = 1;
        long prev2 = 0;

        for (int i = 2; i <= n; i++) {
            fib = prev1 + prev2;
            prev2 = prev1;
            prev1 = fib;
        }

        return fib;
    }

    public static void main(String[] args) {
        int n = 10; // Change this to the desired Fibonacci number
        long startTime = System.currentTimeMillis();
        long result = calculateFibonacci(n);
        long endTime = System.currentTimeMillis();

        System.out.println("Fibonacci(" + n + ") = " + result);
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
    }
}

/*public class FibonacciRecursive {
    public static long calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // Change this to the desired Fibonacci number
        long startTime = System.currentTimeMillis();
        long result = calculateFibonacci(n);
        long endTime = System.currentTimeMillis();

        System.out.println("Fibonacci(" + n + ") = " + result);
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
    }
}
*/