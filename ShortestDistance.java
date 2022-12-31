
public class ShortestDistance {

    public static void main(String[] args){

        String[] arr = {"a","b","hello"};
        String a = "hello";
        int start = 0;

        int x = closetTarget(arr,a,start);
        System.out.println(x);
    }

    static int closetTarget(String[] words, String target, int startIndex) {


        int n = words.length;
       int ans = 100;
        int ans1 = 0;

        int i = 0;
        for(; i<n; i++)
        {
            if (words[i] == target)
            {
                ans1 = Math.abs(i-startIndex);

                int ans2 =0;
                if (i > startIndex)
                {
                    ans2 = startIndex + n -i;
                }
                else {
                    ans2 = i + n - startIndex;
                }

                if (ans1 < ans || ans2 < ans)
                ans = Math.min(ans1,ans2);
            }



        }
        if (ans == 100)
        {
            return -1;
        }

        return ans;

    }
}

