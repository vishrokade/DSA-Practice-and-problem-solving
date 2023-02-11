package StringPrograms;

import java.util.Arrays;

public class PalindromeString {
    public static void main(String[] args){

        System.out.println(find("abcdcba"));
    }

    static boolean find(String str){

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            builder.append(str.charAt(i));
        }

        String s = builder.toString();
        if (str.equals(builder.toString())){
            return true;
        }

        return false;
    }
}
