package College;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class Stocks {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1};

        int min = arr[0];
        int profit = 0;

        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - min;

            profit = Math.max(profit, diff);
            min = Math.min(min, arr[i]);
        }

        System.out.println(profit);
    }
}
