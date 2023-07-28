package College;

public class LongestIncreasingSubSequence {
    public static void main(String[] args) {
        int[] arr = {1,3,5,4,7};

        int j = 0;
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[j]){
                count++;
                j = i;
            }
        }

        System.out.println(count);
    }
}
