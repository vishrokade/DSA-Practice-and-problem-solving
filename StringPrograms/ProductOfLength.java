package StringPrograms;
//https://leetcode.com/problems/maximum-product-of-word-lengths/
public class ProductOfLength {
    public static void main(String[] args) {

        String[] words  = {"vish" , "rok" , "vi"};
        int ans = find(words);
        System.out.println(ans);
    }

    static int find(String[] words){
        int max = 0;
        for (int i = 0; i < words.length-1; i++){
            for (int j = i+1; j < words.length; j++){
                if(notSame(words[i],words[j])){
                    int temp = words[i].length() * words[j].length();
                    max = Math.max(max,temp);
                }
            }
        }
        return max;
    }

    static boolean notSame(String a, String b){

        for (int i = 0 ; i < a.length(); i++){
            char ch = a.charAt(i);
            if (b.contains(String.valueOf(ch))){
                return false;
            }
        }
        return true;
    }
}
