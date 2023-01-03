import java.util.HashSet;

public class PartitionStringK {
    public static void main(String[] args){
        String s = "165462";
        int k = 60;
        System.out.println(partition(s,k));

    }
    private static int partition(String str,int k) {

        int count = 0;
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            s = s+str.charAt(i);
            if (Long.valueOf(s) > k){
                count++;
                s = "";
                s = s+str.charAt(i);
                if (Long.valueOf(s)>k) {
                    return -1;
                }

            }

        }
        return count+1;
    }
}
