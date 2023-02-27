import java.util.Arrays;

public class DivisibaleWord {
    public static void main(String[] args){
        String str = "1010";
        int m = 10;
        int[] arr = new int[str.length()];

        long ans = 0;
        for (int i = 0; i < str.length(); i++) {
            ans = ((ans * 10) + (str.charAt(i) - '0')) % m;
            //long temp = (Long.parseLong(str.substring(0,i)) % m);
//
            if(ans == 0){
                arr[i] = 1;

            }
            else{
                arr[i] = 0;
            }
        }
//        long temp = (Long.parseLong(str) % m);
//        if (temp == 0){
//            arr[arr.length-1] = 1;
//        }
//        else {
//            arr[arr.length-1] = 0;
//        }

//        int j = Integer.parseInt(str.substring(0,1));
//        System.out.println(j);

        System.out.println(Arrays.toString(arr));
    }
}
