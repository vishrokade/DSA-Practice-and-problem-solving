import java.util.ArrayList;
import java.util.List;

public class PascalTringle {
    public static void main(String[] args){
        List<Integer> ans = new ArrayList<>();
        ans = getRow(3);
        System.out.println(ans);
    }

    static  List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<Integer>();
        for(int i = 0;i<rowIndex+1;i++) {
            res.add(1);
            for(int j=i-1;j>0;j--) {
                res.set(j, res.get(j-1)+res.get(j));
            }
        }
        return res;
    }
}
