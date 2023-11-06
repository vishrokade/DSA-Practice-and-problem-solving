public class MinimumSum {
    public static void main(String[] args) {

        int nums[] = {5,4,8,7,10,2};
        int sum = -1;
        for(int i = 0; i < nums.length-2;i++){
            for(int j = i+1;j<nums.length-1;j++){
                for(int k = j+1;k<nums.length;k++){
                    int temp = nums[i] + nums[j] + nums[k];
                    if(nums[i] < nums[j] && nums[j] > nums[k]){
                        if(sum == -1){
                            sum = temp;
                        }

                        if(temp < sum){
                            sum = temp;
                        }
                    }

                }
            }
        }

        System.out.println(sum);


//        int len=nums.length;
//
//        int prefix[]=new int[len];
//
//        int suffix[]=new int[len];
//
//        int min-nums[0];
//
//        for(int i=0;i<len;i++){
//
//            int val=nums[i]; if(val<min){ min=val;
//
//            } prefix[i]=min;
//
//        }
//
//        int min2=nums[len-1];
//        for(int i=len-1;i>=0; i--){
//
//            int val=nums[i];
//            if (val<min2)
//
//                min2=val;
//
//            suffix[i]=min2;
//
//        }
//        int ansr=-1;
//
//        for(int i=1;i<len-1;i++){
//
//            if(nums[i]>prefix[i-1] && nums[i]>suffix[i+1]){
//
//                int sum=nums[i]+prefix[i-1]+suffix[i+1];
//
//                if(ansr==-1)
//
//                    ansr=sum;
//
//                else {
//
//                    if(sum<ansr)
//
//                        ansr=sum;
//
//                }
//
//            }
//
//        }
//
//        return ansr;
    }
}
