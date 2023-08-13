package College;

public class FinalString {
    public static void main(String[] args) {
        String str = "poiinter";

        System.out.println(finAns(str));
    }

    static String finAns(String s){

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'i'){
                str.reverse();
            }else {
                str.append(s.charAt(i));
            }

        }

        return str.toString();
    }

}
