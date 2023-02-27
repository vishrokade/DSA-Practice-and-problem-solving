import java.lang.*;
import java.util.*;
import java.io.*;
class CodechefToDoList {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i =0;i<n;i++){
                int N= sc.nextInt();
                find(N);

            }
        }

        static void find(int num){
            Scanner sc = new Scanner(System.in);
            int count = 0;
            int arr[] = new int[num];
            for (int j=0;j<num;j++){
                arr[j]=sc.nextInt();
                if(arr[j]>=1000){
                    count++;
                }
                System.out.println(count);
            }
        }
}
