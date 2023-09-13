package GiriTechHubPractice;

public class Fibonacci {
    public static void main(String[] args) {
        long first = 0;
        long second = 1;
        System.out.print(first+" ");
        System.out.print(second+" ");

        for (int i = 2; i < 100; i++) {
            long sum = first + second;
            System.out.print(sum+"  ");
            first = second;
            second = sum;
        }
    }
}
