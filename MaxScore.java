import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MaxScore {
    public static void main(String[] args){

        int[] arr = {1,10,3,3,3};
        find1(arr,3);
    }

    static long find(int[] arr, int k){

        long score = 0;
        int n = arr.length-1;
        while (k>0){
            Arrays.sort(arr);
            score = score + arr[n];
            double x = (double) arr[n]/3;
            arr[n] = (int)Math.ceil(x);
            k--;
        }
        return score;
    }

    static void find1(int[] arr, int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
        }
        int score = 0;
        while (k>0){
            score = score + queue.peek();
            double x = (double)queue.peek()/3;
            int y = (int)Math.ceil(x);
            queue.poll();
            queue.add(y);
            k--;
        }
        System.out.println(score);
    }
}