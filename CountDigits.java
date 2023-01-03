public class CountDigits {
    public static void main(String []args){
        System.out.println(count(100));

    }
    static int count(int num){
        int count = 0;
        int no = num;
        int remainder;
        while (num != 0) {
            remainder = num % 10;
            if (remainder != 0 && no % remainder == 0){
                count++;
            }

            num /= 10;
        }
        return count;
    }
}
