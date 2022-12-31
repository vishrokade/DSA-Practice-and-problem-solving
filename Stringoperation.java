public class Stringoperation {
    public static void main(String[] args) {

        String x = "hello world";
        int n = x.length();
        char[] list = new char[n];
        String ans = "";

        //System.out.print(x.substring(1));
       /* for (int i = 0; i < n; i++) {
            list[i] = x.charAt(i);
        }

        for(int i=0;i<n;i++){
            System.out.println(list[i]);
        }

        */


        int i = 0;
        int j = 0;
        while(j<n){
            if(x.charAt(j) != 'e'){
                list[i] = x.charAt(j);
                i++;
                j++;
            }
            else {
                j++;
            }
        }

       // System.out.println(list);

       /* Set character = new HashSet();

        for(int i=0;i<n;i++){
            character.add(x.charAt(i));
        }

        System.out.println(character);

        */

        for(int k = 0; k<n; k++){
            if(x.charAt(i) != 'e'){
                ans = ans + x.charAt(i);
            }
        }
        System.out.println("ans   "+ans);
    }
}
