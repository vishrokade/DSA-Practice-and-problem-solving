package College;

import java.util.ArrayList;

public class SubSequnces {
    public static void main(String[] args) {

//        int ans = findSubsequence("","bccbcdcabadabddbccaddcbabbaaacdba","bccbbdc");
//        System.out.println(ans);

        System.out.println(findsb("","abc"));
    }

    static int findSubsequence(String p, String up,String t){

        if (up.isEmpty()){
            if (p.equals(t))
            {
                System.out.println(p);
                return 1;
            }
            return 0;
        }

        char ch = up.charAt(0);

        int l = (findSubsequence(p,up.substring(1),t));
        int r = (findSubsequence(p+ch,up.substring(1),t));
        return l+r;
    }

    static ArrayList<String> findsb(String p, String up){
        ArrayList<String> list = new ArrayList<>();
        if (up.isEmpty()){
           list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = findsb(p,up.substring(1));
        ArrayList<String> right = findsb(p+ch,up.substring(1));

        left.addAll(right);
        return left;
    }
}
