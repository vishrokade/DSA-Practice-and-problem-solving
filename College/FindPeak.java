package College;

public class FindPeak {
    public static void main(String[] args) {
        int[] nums= {2,1,1,5,6,2,3,1};
        int ans = findPeak(nums);
        System.out.println(ans);
    }
    static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]) end = mid;
            else start=mid+1;
        }
        return arr[end];
    }
}
