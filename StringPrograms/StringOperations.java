package StringPrograms;

import java.util.Arrays;

public class StringOperations {

    public static void main(String[] args) {
        String str = new String();
        str = "vishal mahesh anmol ramesh";
        String str1= " rokade";

        System.out.println(str.concat(str1));

        System.out.println(str.indexOf('l'));

        String[] strings = str.split(" ");

        for (String s: strings
             ) {
            System.out.println(s);
        }

        int no = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" "+no++);
            }
            System.out.println();
        }

    }
}
