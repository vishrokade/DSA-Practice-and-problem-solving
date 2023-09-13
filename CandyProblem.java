public class CandyProblem {
    public static void main(String[] args) {
        int[] arr = {1,2,15,15,7,4,3,1};

        int ans[]  =  new int[arr.length];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = 1;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1]){
                ans[i] = ans[i-1] +1;
            }
        }

        for (int i = arr.length-2; i >= 0 ; i--) {
            if (arr[i] > arr[i+1] && ans[i] <= ans[i+1]){
                ans[i] = ans[i+1]+1;
            }
        }

        int res = 0;
        for (int i = 0; i < ans.length; i++) {
            res = res + ans[i];
        }

        System.out.println(res);

    }
}
