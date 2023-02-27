public class SingleElementInsoreted {
    public static void main(String[] args){
        int arr[] = {3,3,7,7,10,11,11};
        System.out.println(find(arr));

    }
    static int find(int[] arr){

        int left = 0,right = arr.length-1;

        while (left < right){
            int mid = left + (right-left)/2;

            if(left == right){
                return arr[left];
            }

            if (mid % 2 == 0){
                 if (arr[mid+1] == arr[mid]){
                     left = mid+2;
                 }else {
                     right = mid;
                 }
            }
            else {
                if (arr[mid-1] == arr[mid]){
                    left = mid+1;
                }
                else {
                    right = mid;
                }

            }
        }
        return arr[left];
    }
}
