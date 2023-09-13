package GiriTechHubPractice;

public class PhonePad2 {
    public static void main(String[] args) {
        //phone("","12");
        dice("",5);
    }

    static void phone(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';

        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char) (i + 'a');
            phone(p+ch,up.substring(1));
        }
    }

    static void dice(String p, int target){
        if (target == 0){
            System.out.print(p+" ");
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i , target - i);
        }
    }
}
