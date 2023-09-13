package College;

public class DivisibleBY25 {
    public static void main(String[] args) {
        int count = find("2908305");
    }

    static int find(String num){
        int count = 0;
        int n = num.length();
        int last = Character.getNumericValue(num.charAt(n-1));
        int slast = Character.getNumericValue(num.charAt(n-2));

        return count;
    }
}
