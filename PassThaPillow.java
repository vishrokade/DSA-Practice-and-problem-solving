public class PassThaPillow {
    public static void main(String[] args) {
        int n = 4;
        int time =5;

        System.out.println(find(n,time));
    }
    static int find(int n, int time){


//        if (time < n){
//            return n+1;
//        }

        int div = time/(n-1);
        int rem = time % (n-1);

        if (div % 2 == 0){
            return 1 + rem;
        }
        return n-rem;

    }
}
