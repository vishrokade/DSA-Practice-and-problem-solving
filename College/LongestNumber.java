package College;

import java.util.Arrays;

public class LongestNumber {
    public static void main(String[] args) {

        int[] arr = {2,10};
        int n = arr.length;
        String[] s = new String[n];

        for (int i = 0; i < n; i++) {
            s[i] = String.valueOf(arr[i]);
        }

        Arrays.sort(s,(a,b) -> (b+a).compareTo(a+b));

        StringBuilder sb = new StringBuilder();

        for (String str: s) {
            sb.append(str);
        }

        String ans = sb.toString();

        System.out.println(ans.startsWith("0") ? "0" : ans);

    }
}
