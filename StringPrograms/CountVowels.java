package StringPrograms;
//https://leetcode.com/contest/weekly-contest-331/problems/count-vowel-strings-in-ranges/
import java.util.ArrayList;
import java.util.Arrays;

public class CountVowels {
    public static void main(String[] args){
        String[] words = {"a","e","i"};
        int[][] query = {{0,2},{0,1},{2,2}};

        System.out.println(Arrays.toString(find(words,query)));

    }

    static int[] find(String[] words, int[][] query){
        /*

        //ArrayList<Integer> ans = new ArrayList<>();
        int[] ans = new int[query.length];
        int count = 0;

        for(int i = 0; i < query.length;i++){

            int low = query[i][0];
            int high = query[i][1];
            for (int j = low; j <= high; j++) {
                if (isVowel(words[j].charAt(0)) && isVowel(words[j].charAt(words[j].length()-1)))
                {
                    count++;
                }
            }
            ans[i] = count;
            count = 0;
        }

        return ans;
    }

    static boolean isVowel(char ch){

        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
    */
        int[] ans=new int[query.length];
        int[] str=new int[words.length];
        for(int i=0;i<words.length;i++){
            str[i]=check(words[i]);
        }

        for(int i=0;i < query.length;i++){
            int sum=0;
            int x= query[i][0];
            int y=query[i][1];
            for(int j=x;j<=y;j++){
                sum += str[j];
            }
            ans[i]=sum;
        }
        return ans;
    }
    static int check(String word){
        char f=word.charAt(0);
        char l=word.charAt(word.length()-1);
        if((f == 'a' || f == 'e' || f == 'i' || f == 'o' || f == 'u') && (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u')){
            return 1;
        }
        return 0;


    }
}

//this program take more time
