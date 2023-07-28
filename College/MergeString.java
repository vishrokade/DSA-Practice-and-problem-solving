package College;

public class MergeString {
    public static void main(String[] args) {

        String word1 = "abc";
        String word2 = "pqrbbbb";

        String ans = mergeAlternately(word1,word2);
        System.out.println(ans);
    }

    static String mergeAlternately(String word1, String word2) {

        String str = "";
        int i = 0;
        int j = 0;
        while (i < word1.length() && j < word2.length()) {
            str += word1.charAt(i);
            str = str + word2.charAt(j);

            i++;
            j++;
        }
        if (i == word1.length()) {
            str = str + word2.substring(j);
        }
        if (j == word2.length()) {
            str = str + word1.substring(i);
        }


        return str;
    }
}
