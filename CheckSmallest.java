//https://leetcode.com/problems/minimum-common-value/
public class CheckSmallest {
    public static void main(String[] args){
        int[] num1 ={1,2,3};
        int[] num2 = {0,3};

        int ans = find(num1,num2);
        System.out.println(ans);
    }

    static int find(int[] num1,int[] num2){

        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num2.length; j++) {
                if (num1[i] == num2[j]){
                    return num1[i];
                }
                if (num2[j] > num1[i]){
                    break;
                }
            }
        }
        return -1;
    }
}
