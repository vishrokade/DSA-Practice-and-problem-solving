public class Ascii {
    public static void main(String []args){
        char ch = 'a';
        System.out.println((int)( ch+0));

        String a = "aAa";
        if (a.charAt(0) < a.charAt(1)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        String[] strs = {"zyx","wvu","tsr"};
        System.out.println(find(strs));
    }

    static int find(String[] strs){

        int count = 0;
        int n = strs.length;
        int m = strs[0].length();
        // i = column & j = row
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {

                if (strs[j].charAt(i) < strs[j-1].charAt(i)){
                    count++;
                    break;
                }
            }

        }
        return count;
    }
}
