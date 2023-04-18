import java.util.ArrayList;

public class phonePadExtaOrdanary {
    public static void main(String[] args) {

        int count  = 0;
        ArrayList<String> list = new ArrayList<>();
        list = subSeqRet("","asdf");

        System.out.println(list);
        for (String str: list) {
            mapped(str);
        }
//
        System.out.println(count);

    }

    static ArrayList<String> subSeqRet(String p , String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            if(p != ""){ //this if block is only for not counting the null strings
                list.add(p);
            }
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subSeqRet(p+ch,up.substring(1));
        ArrayList<String> right = subSeqRet(p,up.substring(1));

        left.addAll(right);
        return left;
    }

    static void mapped(String str){
        int sum = 0;
        int n = str.length();

        for (int i = 0; i < n; i++) {
            sum += check(str.charAt(i));
        }
//        if (sum % n == 0){
//            return true;
//        }
//        return false;
        System.out.print(sum+" ");
    }

    static int check(char ch){

        if (ch == 'a' || ch == 'b'){
            return 1;
        }
        if (ch == 'f' || ch =='g' || ch == 'h'){
            return 3;
        }
        if (ch == 'e' || ch =='c' || ch == 'd'){
            return 2;
        }
        if (ch == 'i' || ch =='j' || ch == 'k'){
            return 4;
        }
        if (ch == 'l' || ch =='m' || ch == 'n'){
            return 5;
        }
        if (ch == 'o' || ch =='p' || ch == 'q'){
            return 6;
        }
        if (ch == 'r' || ch =='s' || ch == 't'){
            return 7;
        }
        if (ch == 'u' || ch =='v' || ch == 'w'){
            return 8;
        }if (ch == 'x' || ch =='y' || ch == 'z'){
            return 9;
        }
        return 0;
    }
}
