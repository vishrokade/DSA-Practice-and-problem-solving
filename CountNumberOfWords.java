public class CountNumberOfWords {
    public static void main(String[] args) {

        String[] arr = {"are" , "any" , "u"};
        int count = 0;
        int left = 0;
        int right = 2;

        for (int i = left; i <= right; i++) {
            if (check(arr[i])){
                count++;
            }
        }
        System.out.println(count);
    }
    static boolean check(String str){
        char x = str.charAt(0);
        char y = str.charAt(str.length()-1);
        if ((x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U') && (y == 'a' || y == 'e' || y == 'i' || y == 'o' || y == 'u' || y == 'A' || y == 'E' || y == 'I' || y == 'O' || y == 'U')){
            return true;
        }
        return false;
    }
}
