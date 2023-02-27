package CodechefProblem;

import java.util.Scanner;

public class EasyPronaunciation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int t = sc.nextInt();

        for (int i = 0;i<t;i++){
            int len = sc.nextInt();
            String str = sc.next();

            str.toLowerCase();
            if(len<4){ System.out.println("YES");}
            else {

                for (int j = 0; j < len; j++) {
                    if(count==4){ break; }
                    if (str.charAt(j) != 'a' || str.charAt(j) != 'e' || str.charAt(j) != 'i' || str.charAt(j) != 'o' || str.charAt(j) != 'u' && count < 4) {
                        count++;
                    }
                    if (str.charAt(j) == 'a' || str.charAt(j) == 'e' || str.charAt(j) == 'i' || str.charAt(j) == 'o' || str.charAt(j) == 'u') {
                        count = 0;
                    }

                }

                if (count >= 4) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
    }

}
