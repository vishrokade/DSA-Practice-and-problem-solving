//https://leetcode.com/problems/string-compression/
package StringPrograms;

import java.util.Arrays;

public class StringCompression {
    public static void main(String[] args) {
        char[] arr = {'a','a','b','b','c','c','c'};

        System.out.println(compress(arr));
        System.out.println(Arrays.toString(arr));

    }

    static int compress(char[] chars){

        int n= chars.length;
        if (n<=1){
            return 1;
        }
        int i = 0,j=0;

        while (i<n){
            char ch = chars[i];
            int count = 1;
            while (i+1 < n && chars[i] == chars[i+1]){
                count++;
                i++;
            }
            if (count == 1){
                chars[j++] = ch;  // if the occurrence is only once then just add char
                //update the existing array using j pointer and count the occurrences using i pointer
            }else {
                if (count>1) {
                    String str = count + "";
                    chars[j++] = ch;  // if the occurrence is more than one then add count
                                        //if the count is more than 10 then add each digit of count
                    for (int k = 0; k < str.length(); k++) {
                        chars[j++] = str.charAt(k);
                    }
                }
            }
            i++;
        }
        return j;
    }
}
