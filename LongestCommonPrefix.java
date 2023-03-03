public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] strs = {"ab","a"};
        String prefix = longestCommonPrefix(strs);

        System.out.print(prefix);
    }
    static String longestCommonPrefix(String[] strs) {
//        if(strs.length == 0){
//            return "";
//        }
//
//        String pre = strs[0];
//        int i = 1;
//
//        while(i<strs.length){
//            while(strs[i].indexOf(pre) != 0){
//                pre = pre.substring(0,pre.length()-1);
//                if (pre.isEmpty()) return "";
//            }
//            i++;
//        }
//
//        return pre;

        int n = strs.length;
        String ans = "";

        for (int i = 0; i < strs[0].length(); i++) {

            char ch  = strs[0].charAt(i);
            boolean match = true;

            for (int j = 0; j < n; j++) {
                    if (strs[j].length() < i || ch != strs[j].charAt(i)) {
                        match = false;
                        break;
                    }
                }
                if (match == false) {
                    break;
                } else {
                    ans = ans + ch;
                }
            }

        return ans;
    }
}
