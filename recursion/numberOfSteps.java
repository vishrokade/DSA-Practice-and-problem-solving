package recursion;
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class numberOfSteps {
    public static void main(String []args){
        int steps = steps(45);
        System.out.println(steps);
    }
    static int steps(int no){
        return helper(no,0);
    }
    static int helper(int no , int steps){
        if(no == 0){
            return steps;
        }
        if(no % 2 == 0){
            return helper(no / 2 ,steps+1);
        }
        return helper(no - 1 , steps + 1);
    }
}
