package College;
//if the string i palindrome or not after removing one character from it
//https://leetcode.com/problems/valid-palindrome-ii/description/
public class StringPalindrome {
    public static void main(String[] args) {
        String s = "aban";
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            sb.append(s.charAt(i));
//        }
//        String str;
//        str = String.valueOf(sb);
//
//        if (s.equals(str)){
//            System.out.println("it is palindrome");
//        }
//        else {
//            System.out.println("not");
//        }

        int i = 0, j = s.length() - 1;
        boolean ans = false;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                 ans = (isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1));
            }
            i++;
            j--;
        }
        if (ans == true){
            System.out.println("yes");
        }

    }

    static boolean isPalindrome(String s, int i, int j) {

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}