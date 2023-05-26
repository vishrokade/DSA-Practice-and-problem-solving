public class UglyNumber2 {
    public static void main(String[] args) {
        int n = 10;
        int ans = find(n);
        System.out.println(ans);
    }
    static int find(int n){

        if (n == 1){
            return n;
        }

        int i = 2,j=1;

        while (j != n){
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0){
                j++;
            }
            i++;
        }
        if (j == n){
            return i-1;
        }
        return -1;
    }
}
