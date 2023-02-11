//https://leetcode.com/contest/weekly-contest-331/problems/take-gifts-from-the-richest-pile/
public class TakeGifts {
    public static void main(String[] args){
        int[] arr= {1,1,1,1};
        int k = 4;

        System.out.println(find(arr,k));

    }
    static int find(int[] arr,int k){

        int root = 0;
        int sum = 0;
        while (k > 0){
            int max = findmax(arr);
            root = (int) Math.sqrt(arr[max]);
            int floor = (int) Math.floor(root);
            arr[max] = floor;
            k--;
        }

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }

    static int findmax(int[] arr){
        int max = 0;
        int maxindex = 0;

        for(int i = 0; i < arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
                maxindex = i;
            }
        }
        return maxindex;
    }
}
