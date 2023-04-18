public class PrimeinDiagonal {
    public static void main(String args[]){
        int[][] nums = {{1,2,3},{5,6,7},{9,10,11}};

        System.out.println(diagonalPrime(nums));
    }
    static int diagonalPrime(int[][] nums) {

        int maxPrime = 0;

        for(int i=0,j=0;i<nums.length;i++,j++){
            if(find(nums[i][j]) == true  && nums[i][j] > maxPrime){
                maxPrime = nums[i][j];
            }
        }
        for(int i=nums.length-1,j=0;i>=0;i--,j++){
            if(find(nums[i][j]) == true  && nums[i][j] > maxPrime){
                maxPrime = nums[i][j];
            }
        }

        return maxPrime;
    }

    static boolean find(int no){
        int i,m=0;
        m=no/2;
        if(no<2){
            return false;
        }else{
            for(i=2;i<=m;i++){
                if(no%i==0){
                    return false;
                }
            }
        }
        return true;
    }

}
