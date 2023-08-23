package College;

import java.util.ArrayList;
import java.util.Arrays;

public class SortVowels {
    public static void main(String[] args) {
        String s = "vishaSl";

        String ans = sort(s);

        System.out.println(ans);
    }

    static String sort(String s){

      //  char[] sarr = s.toCharArray();

//        for (int i = 0; i < sarr.length; i++) {
//            for (int j = 0; j < sarr.length; j++) {
//                if (isVowel(sarr[i]) && isVowel(sarr[j])) {
//                    if (sarr[i] < sarr[j]) {
//                        char ch = sarr[i];
//                        sarr[i] = sarr[j];
//                        sarr[j] = ch;
//                    }
//                }
//            }
//        }
//        for (int i = 0; i < sarr.length; i++) {
//            System.out.println(sarr[i]);
//        }
//
//        return new String(sarr);


        char[] chars = s.toCharArray();
        ArrayList<Character> vowels = new ArrayList<>();
        for(char c : chars){
            if(isVowel(c)) vowels.add(c);
        }

        char[] arr = new char[vowels.size()];
        for(int i=0; i<arr.length; i++){
            arr[i] = vowels.get(i);
        }

        Arrays.sort(arr);

        int j=0;
        for(int i=0; i<chars.length; i++){
            if(isVowel(chars[i])){
                chars[i]= arr[j];
                j++;
            }
        }

        return new String(chars);
    }

    static boolean isVowel(char ch){

       // Convert to lowercase for case-insensitive comparison
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';

    }
}
