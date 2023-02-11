package StringPrograms;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args){
        System.out.println(fizz(5));
    }

    static List<String> fizz(int no){

        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= no; i++) {

            String ans = find(i);
            list.add(ans);
        }

        return list;
    }

    static String find(int n){

        if(n%3==0 && n%5==0){return "FizzBuzz";}
        else if(n%3==0){return "Fizz";}
        else if(n%5==0){return "Buzz";}
        return Integer.toString(n) ;

    }
}
