package College;

public class RotateImageMatrix {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] ans = new int[nums.length][nums.length];
       //ans = rotate(nums);

        rotate2(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(" "+ans[i][j]);
            }
            System.out.println();
        }
    }

    static int[][] rotate(int[][] nums){
        int n  = nums.length;
        int[][] ans = new int[n][n];
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                ans[j][(len-1)-i] = nums[i][j];
            }
        }
        return ans;
    }

    // without using extra array
    static void rotate2(int[][] nums){

        int n = nums.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n; j++) {
                swap(nums,i,j);
            }
        }

        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int temp = nums[i][left];
                nums[i][left] = nums[i][right];
                nums[i][right] = temp;
                left++;
                right--;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" "+ nums[i][j]);
            }
            System.out.println();
        }

    }
    static void swap(int[][] nums , int i,int j){
        int temp  = nums[i][j];
        nums[i][j] = nums[j][i];
        nums[j][i] = temp;
    }

    static void reverse(int[][] nums,int row){

        int n = nums.length-1;
        int p1 = 0,p2=n-1;

        while (p1 < p2){
            int temp = nums[row][p1];
            nums[row][p1] = nums[row][p2];
            nums[row][p2] = temp;
            p1++;
            p2--;
        }
    }
}
