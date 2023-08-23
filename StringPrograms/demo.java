package StringPrograms;

import java.util.SplittableRandom;

public class demo {
    public static void main(String[] args) {
        String s = "vishal";
        String v = "bab";

//        for (int i = s.length()-1; i >=0 ; i--) {
//            v = v + s.charAt(i);
//        }
//        if (s.equals(v)){
//            System.out.println(true);
//        }else {
//            System.out.println(false);
//        }
        //System.out.println(withoutA("",s));
        char ch = 'b';
        System.out.println(--ch);
    }

    static String withoutA(String p , String up){
        if(up.length() < 1){
//            System.out.println(p);
            return p;
        }

        char ch = up.charAt(0);

        if (ch == 'a'){
            return withoutA(p,up.substring(1));
        } else {
           return withoutA(p + ch ,up.substring(1));
        }
    }
}
