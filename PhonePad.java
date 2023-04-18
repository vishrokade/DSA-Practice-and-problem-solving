import java.util.ArrayList;

public class PhonePad {
    public static void main(String []args){
        pad("","12");
       // ArrayList list = padReturn("","23");
        //System.out.println(list);
       // System.out.println(solve("","89"));
    }

    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0)-'0'; //-0 will convert string to int

        for(int i = (digit-1) * 3; i<digit*3;i++){
            char ch = (char)('a' + i);
            pad(p+ch,up.substring(1));
        }
    }

    static ArrayList<String> padReturn(String p , String up){
        if(up.isEmpty()){
            ArrayList list = new ArrayList();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for(int i = (digit-1)*3 ; i<digit*3; i++){
            char ch = (char) ('a' + i);
            list.addAll(padReturn(p+ch,up.substring(1)));
        }
        return list;
    }

    public static ArrayList<String> solve(String ans, String ip) {

        if(ip.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans+"");
            return list;
        }

        int digit = ip.charAt(0) - '0';
        int i=(digit-2)*3;
        if(digit > 7) {
            i+=1;
        }
        int len = i+3;
        if(digit == 7 || digit == 9) {
            len+=1;
        }

        ArrayList<String> list = new ArrayList<>();

        for(; i<len; i++) {
            char ch = (char)('a' + i);
            list.addAll(solve(ans+ch, ip.substring(1)));
        }

        return list;

    }
}
