
public class StringChallenge {
    static String stringChallenge(String str){
        StringBuilder result = new StringBuilder();
        int count = 1;
        for(int i =1; i < str.length(); i++){

           if (str.charAt(i) == str.charAt(i-1)){
               count++;
           }
           else {
               result.append(count);
               result.append(str.charAt(i-1));
               count=1;
           }
        }
        result.append(count);
        result.append(str.charAt(str.length()-1));



        char[] charArray = result.toString().toCharArray();
        for (int i = 3; i < charArray.length; i+=4) {
            charArray[i] = '_';
        }
        String answer = new String(charArray);
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(stringChallenge("wwwggopp"));
    }
}
