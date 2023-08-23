package StringPrograms;

public class MatchStringAfterRepeatition {
    public static void main(String[] args) {

        System.out.println(repeatedStringMatch("ab","xyz"));
    }
    static int repeatedStringMatch(String a, String b) {
    String temp = "";
        if(b.equals(temp)){
        return 0;
    }
    int count = 0;
    int i = 0;

    if(checkValid(a,b)){
        while(i < b.length()){
            temp = temp + a;
            count++;
            if(temp.contains(b)){
                break;
            }
            i++;
        }
    }else{
        return -1;
    }
        return count;
}

    static boolean checkValid(String a, String b){

        int n = a.length();
        int m = b.length();

        int i = 0,j=0;
        int flag = 0;

        while(i < n && j < m){
            if(a.charAt(i) == b.charAt(j)){
                i++;
                j++;
            }else {
                j++;
            }
        }

        if(i == n){
            return true;
        }
        return false;
    }
}
