import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class partitionString {
    public static void main(String []args){

        int x = partition("sssss");
        System.out.println(x);
    }

    private static int partition(String str) {

        int i = 0;
        int count = 0;
        HashSet<Character> set = new HashSet<Character>();
        while(i<str.length()){
            if (set.contains(str.charAt(i))){
                set.clear();
                count++;
            }
        }
        return count+1;
    }
}
