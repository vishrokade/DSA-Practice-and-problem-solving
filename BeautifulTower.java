import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

class BeautifulTower{
    public static void main(String[] args) {
        int arr[] = {6,5,3,9,2,7};
        makeSmallRight(arr,3);
        makeSmallLeft(arr,3);

        System.out.println(Arrays.toString(arr));
    }

    static void makeSmallRight(int nums[],int max){
        for (int i = max; i < nums.length-1; i++) {
            if (nums[i] < nums[i+1]){
                nums[i+1] = nums[i];
            }
        }
    }

    static void makeSmallLeft(int[] nums,int max){
        for (int i = max; i > 0; i--) {
            if (nums[i] < nums[i-1]){
                nums[i-1] = nums[i];
            }
        }
    }
}