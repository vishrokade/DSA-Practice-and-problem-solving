package StringPrograms;
// https://leetcode.com/problems/excel-sheet-column-title/
public class ConvertToString {
    public static void main(String[] args) {
        System.out.println(find(28));

    }

    static String find(int no){
        String ans = "";
        while (no != 0){
            no--;
                char ch = (char) (65 + (no % 26));
                ans = ch + ans;
                no /= 26;

        }
        return ans;
    }
}
