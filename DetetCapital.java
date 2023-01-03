//https://leetcode.com/problems/detect-capital/description/
public class DetetCapital {
    public static void main(String[] args){
        String str = "oooo";

        boolean ans = find(str);
        System.out.println(ans);

    }

    static boolean find(String str){

        int totalCapitals = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))){
                totalCapitals++;
            }
        }

        if (totalCapitals == str.length()){
            return true;
        }else if (totalCapitals == 0){
            return true;
        } else if (Character.isUpperCase(str.charAt(0)) && totalCapitals == 1) {
            //this condition is to check that there must be only one capital and must on first place
            return true;
        }
        else
            return false;
    }
}
