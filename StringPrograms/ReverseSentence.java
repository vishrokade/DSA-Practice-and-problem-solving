package StringPrograms;

import javax.swing.*;

public class ReverseSentence {
    public static void main(String[] arg){

        String str = "My name is vishal";
        String ans = reverse(str);
        System.out.println(ans);

    }

    static String reverse(String str){

        StringBuilder rev = new StringBuilder();
        
        int j = str.length();

        for (int i = str.length()-1;i>=0 ;i--) {
            
            if (str.charAt(i) == ' '){
                j=i;
            } else if (i == 0 || str.charAt(i-1) == ' ') {
                if (rev.length() != 0){
                    rev.append(' ');
                }
                rev.append(str.substring(i,j));
            }
        }

        return rev.toString();
    }
}
