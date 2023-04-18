package StringPrograms;

import java.util.SplittableRandom;

public class demo {
    public static void main(String[] args) {
        String s = "bab";
        String v = "";

        for (int i = s.length()-1; i >=0 ; i--) {
            v = v + s.charAt(i);
        }
        if (s.equals(v)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
