package StringPrograms;

public class NumberOfBeautifulIntegers {
    public static void main(String[] args) {
        int low = 1;
        int high = 10 ;
        int k = 1;

        int count = 0;

        for (int i = low; i <= high; i++) {
            if (i % k == 0){
                if (check(i) == true){
                    count++;
                }
            }
        }



        System.out.println(count);

    }

    static boolean check(int no){

        String numberStr = Integer.toString(no);
        if (numberStr.length() % 2 == 1){
            return false;
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < numberStr.length(); i++) {
            int digit = Character.getNumericValue(numberStr.charAt(i));
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        //System.out.println(evenCount + "" + oddCount);
        return evenCount == oddCount;
    }
}
