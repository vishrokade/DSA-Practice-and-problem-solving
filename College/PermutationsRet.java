package College;

import java.util.ArrayList;

public class PermutationsRet {
    public static void main(String[] args) {
        String str = "abc";

        ArrayList<String> ans = new ArrayList<>();
        ans = permutations("","ABSG");
        System.out.println(ans);

    }

    static ArrayList<String> permutations(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            ans.addAll(permutations(first+ch+second,up.substring(1)));
        }
        return ans;
    }
}
