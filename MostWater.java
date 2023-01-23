import static java.lang.Math.abs;

public class MostWater {
    public static void main(String[] args){

        int[] cont = {1,8,6,2,5,4,8,3,7};
        int ans = find(cont);
        System.out.println(ans);

    }

    static int find(int[] cont){

        /*
        int total2  = 0;
        int total = 0;
        for (int i = 0;i < cont.length ; i++) {

            for (int j = 0; j < cont.length; j++) {

                int n = j-i;
                if (n != 0) {

                    if (cont[j] <= cont[i]) {
                        total = cont[j] * n;
                    }

                    if (cont[i] <= cont[j]) {
                        total = cont[i] * n;
                    }


                    if (total > total2) {
                        total2 = total;
                    }
                }

            }

        }
        return total2;

         */

        int left = 0;
        int right = cont.length-1;
        int ans = 0;

        while(left < right){
            if (cont[left] < cont[right]){
                ans = Math.max(ans,cont[left] * (right-left));
                left++;
            }
            else {
                ans = Math.max(ans,cont[right] * (right-left));
                right--;
            }
        }
        return ans;
    }
}
