package College;

import java.util.ArrayList;

public class CanSplitArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        System.out.println(check(5));
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list.get(1));
    }

    static int check(int no){
        if (no == 1){
            return 0;
        }
        return 2+check(no-1);
    }
}
