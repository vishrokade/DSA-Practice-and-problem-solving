package StringPrograms;
//https://leetcode.com/problems/minimum-penalty-for-a-shop/
public class MinimumPenalty {
    public static void main(String[] args) {
        String s = "YYNY";
        System.out.println(findPenalty(s));
    }

    static int findPenalty(String str){
        int penalty = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i <= str.length(); i++) {
            int temp  = findY(str,i) + findN(str,i);
            if (temp < penalty){
                penalty = temp;
                index = i;
            }
        }

        return index;
    }

    static int findN(String s, int id){

        int count = 0;
        for (int i = 0; i < id; i++) {
            if (s.charAt(i) == 'N'){
                count++;
            }
        }
        return count;
    }

    static int findY(String s,int start){
        int count = 0;

        for (int i = start; i < s.length(); i++) {
            if(s.charAt(i) == 'Y'){
                count++;
            }
        }
        return count;
    }

//    static  int bestClosingTime(String str) {
//        int max_score = 0, score = 0, bestTime = -1;
//
//        for (int i = 0; i < str.length(); ++i) {
//            score += (str.charAt(i) == 'Y') ? 1 : -1;
//            if (score > max_score) {
//                max_score = score;
//                bestTime = i;
//            }
//        }
//        return bestTime + 1;
//    }
}
