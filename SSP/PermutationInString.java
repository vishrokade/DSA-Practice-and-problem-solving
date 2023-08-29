package SSP;

import java.util.ArrayList;

public class PermutationInString {
    public static void main(String[] args) {
        System.out.println(checkInclusion("isa","vishal"));
    }

    static boolean checkInclusion(String s1, String s2) {

        if (s2.contains(s1)){
            return true;
        }

        ArrayList<String> list = findPermutations("" , s1);

        for (String s: list) {
            if (s2.contains(s)){
                return true;
            }
        }
        return false;
    }

    static ArrayList<String> findPermutations(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }

        char ch = up.charAt(0);
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);
            String second = p.substring(i);
            list.addAll(findPermutations(first + ch + second,up.substring(1)));
        }
        return list;
    }
}
