package StringPrograms;

import java.util.ArrayList;

public class FindAllSubstrings {
    public static void main(String[] args) {
        String str = "abc";

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                list.add(str.substring(i,j));
            }
        }

        System.out.println(list);
    }

}
