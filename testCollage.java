public class testCollage {

    public static void main(String []args){

        primeNo(34);
        factorial(20);
        fibonacci(10);
        starPattern(5);
        swap(20,10);
    }

    private static void swap(int a, int b) {
        //swapping without taking the third variable
        System.out.println("a and b are "+a +b);

        int c= a+b;
        b=c-b;
        a=c-a;

        System.out.println("a and b are " +a +b );

    }

    private static void starPattern(int row) {

        System.out.println();
        for(int i = 1; i<=row; i++){

            for(int j = 1; j <= row-i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    private static void fibonacci(int no) {

        int sum1 = 0;
        int sum2 = 1;

        while(no > 0){
            int sum3 = sum1+sum2;
            System.out.print(sum1+" ");
            sum1=sum2;
            sum2 = sum3;
            no--;

        }
    }

    private static void factorial(int no) {

        long fact = no;

        while (no != 1){
            fact = fact * (no-1);
            no--;
        }

        System.out.println(fact);
    }

    private static void primeNo(int i) {

        if(i == 0 || i == 1){
            System.out.println("No is not prime");
        }

        int half = i/2;
        int flag = 0;

        //check by dividing the no till the half of the no
        for(int j = 2; j <= half; j++){

            if(i % j == 0){
                System.out.println("No is not prime");
                flag = 1;
                break;
            }
        }

        if(flag == 0){
            System.out.println("No is prime");
        }

    }
}
