import java.lang.reflect.Array;
import java.util.Arrays;

public class pivot {
    public static void main(String[] args){
        int x = 8;
        int sum = 0;
        for(int i = 1; i <=8; i++){
            sum = 0;
            for(int j=i; j<=8;j++){
                sum +=j;
            }
            if(sum == i*(i+1)/2)
            {System.out.println(i);}
        }

        int[][] arr = {
                {2,3,4},
                {5,6,7},
                {9,10,11,55},
                {11,11,11,11}
        };

        int a = arr.length;
        System.out.println("length of arr"+a);
        int b = arr[3].length;
        System.out.println("length of second row"+b);

        int target = 33;

        //int index = search(arr);

        System.out.println("max number  "+search((arr)));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        int s = count(12379) ;
        int number = 12345;
        int  k = (int)(Math.log10(number)+1);
        System.out.println(k);
        if(s % 2 == 0){
            System.out.println("digits in the number are even ");
        }
        else{
            System.out.println("digits in the number are odd ");
        }

        int welth1 = welth(arr);
        System.out.println("welth of the person is  "+welth1);


        System.out.println("addition of the ascii numbers");
        System.out.println('C'+'O'+'D'+'E');
        System.out.println("C"+"O"+"D"+"E");




    }

    public static int search(int[][] nums){
        int max =Integer.MIN_VALUE;
        for(int row=0;row<nums.length;row++){
            for(int col=0;col<nums[row].length;col++){
                if(nums[row][col] >max){
                    max = nums[row][col];
                }
            }
        }
        return max;
    }

    static int count(int num){
        int count = 0;
        while(num > 0){
            count++;
            num/=10;
        }
        return count;
    }

    static int welth(int[][] num){
        int wel = Integer.MIN_VALUE;
        for(int row =0;row<num.length;row++){

            int sum = 0;
            for(int col=0;col < num[row].length;col++){

                sum += num[row][col];
            }
            if(sum>wel){
                wel = sum;
            }
        }
        return wel;
    }
}
