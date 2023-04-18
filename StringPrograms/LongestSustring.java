package StringPrograms;

import java.util.ArrayList;

//5. Longest Palindromic Substring
public class LongestSustring {
    public static void main(String[] args) {
        String str = "babas";

        //System.out.println(subSeqRet("",str));
        System.out.println(longestPalindrome(str));



    }

    static String longestPalindrome(String s) {

        String ans = "";
        ArrayList<String> list = new ArrayList<>();
        list = allSubstring(s);

        for (String str : list) {
            if (polindrome(str) && str.length() > ans.length()){
                    ans = str;
            }
        }
        return ans;
    }

    static boolean polindrome(String str){
        String s = "";
        for (int i = str.length()-1; i >= 0; i--) {

            s = s + str.charAt(i);
        }

        if (s.equals(str)){
            return true;
        }
        return false;
    }

    static ArrayList<String> allSubstring(String str){
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                list.add(str.substring(i,j));
            }
        }

        return list;
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
}
