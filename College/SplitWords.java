package College;

import java.util.*;

public class SplitWords {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words = List.of(new String[]{"one.two.three", "four.five", "six"});
        char sep = '.';

        List<String> res = new ArrayList<>();
        res = splitbySeperator(words,sep);
        for (String str: res
             ) {
            System.out.println(str);
        }
    }

    static List<String> splitbySeperator(List<String> words, char sep){

        List<String> ans = new ArrayList<>();

        for (String str : words) {
            ans.add(String.valueOf(str.split(String.valueOf(sep))));
        }
        return ans;
    }
}
