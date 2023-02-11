package StringPrograms;

import java.util.ArrayList;

public class first {
    public static void main(String[] ars){


        String a = "vishal";
        String b = "vishal";
        String c = a;
        System.out.println(a==b);

        if (a == b){
        System.out.println("True");
        }
        else {
            System.out.println("false");
        }

        //Operator

        System.out.println('a' + 'b');

        System.out.println('a' + 2);

        System.out.println("a" + "b");

        System.out.println("a" + 1);

        System.out.println("a" + new ArrayList<>());

        for (int i = 65; i < 91; i++) {
            System.out.println((char)(i));
        }

        String atoz = "";
        for (int i = 0; i < 26; i++) {

            char ch = (char)('a'+i);
            atoz = atoz + ch;   //create new object each time and increase the space of the program

        }

        System.out.println(atoz);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {

            char ch = (char)('a'+i);
            builder.append(ch);  // add the char to the existing object or editing the exiting object
        }

        String s = builder.toString();
        System.out.println(builder.toString());


    }
}
