import java.util.ArrayList;
import java.util.List;

public class AlterDigitsum {
    public static void main(String[] args){
        int digit =  521;
        int sum = 0;
        String str = digit+"";
        for (int i = 0; i < str.length(); i++) {
            sum = sum + (str.charAt(i)-'0');
        }

        System.out.println(sum);

        //System.out.println(find(digit));

    }
    static int find(int digit){

      /*  List<Integer> list = new ArrayList<>();
        int sum = 0;

        while(digit > 0){

            list.add(digit % 10);
            digit = digit/10;
        }
        for(int i = list.size()-1;i>=0;i--){
            if(isodd(i) == true){
                sum = sum + -(list.get(i));
            }else {
                sum = sum + (list.get(i));
            }
        }
        return sum;

       */

        String str = digit + "";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if(i % 2 == 0){
                sum = sum + (int)str.charAt(i);
            }
            else {
                sum = sum - (int)str.charAt(i);
            }
        }
        return sum;
    }
    static boolean isodd(int i){

        if(i % 2 == 0){
            return false;
        }
        return true;
    }


}
