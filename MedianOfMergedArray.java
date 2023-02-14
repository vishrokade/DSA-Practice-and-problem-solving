public class MedianOfMergedArray {
    public static void main(String[] args){
        int[] nums1 = {1,3};
        int[] nums2 = {2,7};

        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        /*
        int sum1=0;
        int sum2 = 0;

        for(int  i =0;i<nums1.length;i++){
            sum1 += nums1[i];
        }

        for(int i = 0; i<nums2.length;i++){
            sum2 += nums2[i];
        }
        int sum3 = sum1+sum2;
        System.out.println(sum3);
        return (double) (sum3)/((nums1.length)+(nums2.length));

         */
        int n1=nums1.length;
        int n2=nums2.length;
        int [] nums3=new int [(n1+n2)];
        int i=0,j=0,k=0;
        while(i<n1&&j<n2){
            if(nums1[i]<nums2[j]){
                nums3[k]=nums1[i];
                i++;
                k++;
            }
            else{
                nums3[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<n1){
            nums3[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n2){
            nums3[k]=nums2[j];
            j++;
            k++;
        }

        if((n1+n2)%2!=0)
            return (double)nums3[(n1+n2)/2];
        else
            return (double)(nums3[(n1+n2)/2]+nums3[(n1+n2)/2-1])/2;

    }
}
