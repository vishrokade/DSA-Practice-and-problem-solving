public class Merge2D {
    public static void main(String[] args){

        int[][] nums1 = {{1,2},{2,3},{4,5}};
        int[][] nums2 = {{1,4},{3,2},{4,1}};

        int[][] ans = find(nums1,nums2);
        System.out.println(ans.toString());
    }
    static int[][] find(int[][] nums1,int[][] nums2){
        int n= nums1.length-1;
        int m = nums2.length-1;
        int[][] arr3= new int[nums1.length+nums2.length][2];
        int i = 0,j=0,k=0;

        while (i<nums1.length || j<m){
            if (nums1[i][0] == nums2[j][0] ){
                arr3[k][0] = nums1[i][0];
                arr3[k][1] = nums1[i][1] + nums2[j][1];

                k++;j++;i++;
            }
            if (nums1[i][0] < nums2[j][0]) {
                arr3[k][0] = nums1[i][0];
                arr3[k][1] = nums1[i][1];
                k++;i++;
            }

            if (nums1[i][0] > nums2[j][0] ){
                arr3[k][0] = nums2[j][0];
                arr3[k][1] = nums2[j][1];
                k++;j++;
            }
        }

        while (i<=n){
            arr3[k][0] = nums1[i][0];
            arr3[k][1] = nums1[i][1];
            k++;i++;
        }
        while (j<m){
            arr3[k][0] = nums2[j][0];
            arr3[k][1] = nums2[j][1];
            k++;j++;
        }
        return arr3;
    }
}
