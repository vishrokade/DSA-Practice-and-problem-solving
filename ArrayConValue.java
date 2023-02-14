public class ArrayConValue {
    public static void main(String[] args){
        int[] nums = {5,14,13,8,12};
        System.out.println(find(nums));
    }

    static long find(int[] nums){
        int start=0;
        int end=nums.length-1;

        long ans = 0;
        while (start<=end){

            if (start == end){
                ans += nums[start];
                return ans;
            }
            String s1 = Integer.toString(nums[start]);
            String s2 = Integer.toString(nums[end]);
            String s = s1+s2;
            long sum = Long.parseLong(s);
            ans += sum;

            start++;
            end--;
        }

        return ans;
    }
}
