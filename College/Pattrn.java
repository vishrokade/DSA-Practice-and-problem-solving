package College;

public class Pattrn {
    public static void main(String[] args) {

        int[][] ans = printpattern(4);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }

    }



    static int[][] printpattern(int no){


        int top = 0;
        int bottom = no-1;
        int mid = no/2;
        int number = 1;

        int[][] ans = new int[no][no];
        while (top <= mid && mid <= bottom){
            if (top <= bottom){
                for (int i = 0; i < no; i++) {
                    ans[top][i] = number;
                    number++;
                }
                top++;
            }

            if (bottom >= top ){
                for (int i = 0; i < no; i++) {
                    ans[bottom][i] = number;
                    number++;
                }
                bottom--;
            }
        }

        return ans;
    }
}
