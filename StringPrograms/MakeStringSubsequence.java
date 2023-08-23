package StringPrograms;

public class MakeStringSubsequence {

    public static void main(String[] args) {
        String s1 = "zc";
        String s2 = "ad";

        System.out.println(check(s1,s2));
    }

    static boolean check(String s1,String s2){

        int lenOfF = s1.length();
        int lenOfS = s2.length();

        int count = 0;
        int index = 0;

        for (int i = 0; i < lenOfS; i++) {

            char ch = s2.charAt(i);
            char ori = ch;
            if (ch == 'a'){
                ch = 'z';
            }
            else {
                ch--;
            }

            while(index < lenOfF){
                char c = s1.charAt(index);

                if (c == ch || c == ori){
                    count++;
                    index++;
                    break;
                }
                else {
                    index++;
                }
            }
        }

        if (count == lenOfS){
            return true;
        }
        return false;
     }
}
