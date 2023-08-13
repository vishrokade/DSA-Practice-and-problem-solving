package College;

public class FractionPairSum {
    public static void main(String[] args) {
        int[] a = {2 ,2, 1, 2, 2, 3, 3, 2, 1};
        int[] b = {3, 2, 3, 3, 5, 4, 3 ,2 ,4};
        int count = 0;

        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {


                double num = ((b[i] * a[j]) + (a[i] * b[j]));
                double den = b[i] * b[j];

                double temp = (num / den);
                System.out.println(temp);
                if (temp == 1.0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
