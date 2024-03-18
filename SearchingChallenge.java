import java.util.HashMap;

public class SearchingChallenge {
    static String SearchingChallenge(String str){
        String[] words = str.split(" ");
        String ans = "";
        int maximum = 0;

        for (String word : words) {
            HashMap<Character, Integer> map = new HashMap<>();

            for (char c: word.toCharArray()) {
                map.put(c, map.getOrDefault(c,0)+1);
            }
            int wordmax = 0;
            for (int i : map.values()){
                wordmax = Math.max(wordmax, i);
            }

            if (wordmax > maximum){
                maximum = wordmax;
                ans = word;
            }
        }
        return maximum > 1 ? ans : "-1";
    }
    public static void main(String[] args) {
        System.out.println(SearchingChallenge("Today, is the greatest day ever!"));
    }
}
