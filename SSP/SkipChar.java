package SSP;

public class SkipChar {
    public static void main(String[] args) {
        String s  = "bacappfgapplecad";
        skip("",s);
    }

    static void skip(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if (!up.startsWith("apple") && up.startsWith("app")){
            skip(p,up.substring(3));
        }else {
            skip(p + ch, up.substring(1));
        }
    }
}
