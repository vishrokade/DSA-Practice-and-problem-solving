//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
package StringPrograms;

public class FirstOccurance {
    public static void main(String[] args){

        String haystack = "leetcode";
        String needle = "leeto";

        System.out.println(findIndex(haystack,needle));

    }
    static int findIndex(String haystack, String needle){

        int ans = 0;
        int j = 0;
        boolean ch = false;
        if (haystack.contains(needle)){
            for (int i = 0; i < haystack.length(); i++) {
                if (haystack.charAt(i) == needle.charAt(j)){
                    ch = check(haystack.substring(i),needle);
                }
                if (ch == true){
                    return i;
                }
            }
        }
        return -1;

    }

    static boolean check(String h, String n){
        int count=0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == h.charAt(i)){
                count++;
            }
        }
        if (count==n.length()){
            return true;
        }
        return false;
    }
}
