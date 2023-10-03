public class DecodedStringAtIndex {
    public static void main(String[] args) {
        String str = "y959q969u3hb22odq595";
        System.out.println(findAtIndex(str,222280369));
       // leetleetcodeleetleetcodeleetleetcode ;
        //leetleetcodeleetleetcodeleetleetcodeleetleetcode
        //leetleetcodeleetleetcodeleetleetcodeleetleetcode
//        System.out.println((int)'2');
//        System.out.println('2'-'0');
    }

    static String findAtIndex(String s,int k){

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if ((int)s.charAt(i) < 58 && (int)s.charAt(i) > 49){
                int limit = s.charAt(i) - '0';
                String temp = sb.toString();
                for (int j = 1; j < limit; j++) {
                    sb.append(temp);
                    if (k < sb.length()){
                        return sb.substring(k-1,k);
                    }
                }
            }else {
                sb.append(s.charAt(i));
                if (k < sb.length()){
                    return sb.substring(k-1,k);
                }
            }
        }

        System.out.println(sb);
        return sb.substring(k-1,k);

    }
}
