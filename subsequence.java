import java.util.ArrayList;
// p = processed and up = unprocessed
public class subsequence {

    public static void main(String []args){
       // skip("","abc");

        System.out.println(subSeqRet("","abc"));
    }

    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        skip(p+ch , up.substring(1));
        skip(p,up.substring(1));
    }


    static ArrayList<String> subSeqRet(String p , String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            if(p != ""){ //this if block is only for not counting the null strings
                list.add(p);
            }
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subSeqRet(p+ch,up.substring(1));
        ArrayList<String> right = subSeqRet(p,up.substring(1));

        left.addAll(right);
        return left;
    }
}