import java.util.Arrays;

public class avrageOfNumbers {
    public static void main(String []args){
        int[] arr = {1,2,4,4};
        int n = arr[arr.length-1];
        int ans = avg(arr);
        System.out.println(ans);
    }
    static int avg(int[] arr){
        int ans= 0;
        Arrays.sort(arr);
        int count1 =0; //count of minimum value
        int count2 = 0; //count of maximum value

        int min = arr[0];
        int max = arr[arr.length-1];

        for(int i =0;i<arr.length;i++){
            if(arr[i] == min){
                count1++;
            }
            if(arr[i] == max){
                count2++;
            }
        }

        ans = ((min*count1) + (max*count2)) / (count2+count1);
       return ans;
    }
}
