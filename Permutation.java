import java.util.ArrayList;

public class Permutation {
    // p means processed and up = unprocessed
    public static void main(String []args){
        System.out.println(permutationsRet("","abc"));

    }

    static void permutations(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for(int i = 0; i <= p.length();i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            permutations(first + ch + second,up.substring(1));

        }
    }

    static ArrayList<String> permutationsRet(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            System.out.println(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i <= p.length();i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            list.addAll(permutationsRet(first + ch + second,up.substring(1)));

        }
        return list;
    }
}
