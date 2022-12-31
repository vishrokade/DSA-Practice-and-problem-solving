package recursion;

import java.util.ArrayList;

public class isSorted {
    public static void main(String[]  args){
        int[] arr = {1,2,4,4,5,6};
       // System.out.println(sortedRec(arr,0));
        //System.out.println("Target is at  " + linearSearch(arr,4,arr.length-1));

         ArrayList<Integer> list = new ArrayList<>();

        System.out.println(findAllIndex2(arr,4,0));
    }

    static boolean sorted(int[] arr){
       for(int i = 0; i<arr.length-1; i++){
           if(arr[i] > arr[i+1]){
               return false;
           }
       }
       return true;
    }

    static boolean sortedRec(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && sortedRec(arr,index+1);
    }

    static int linearSearch(int[] arr,int target, int index){
        if(index == -1){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }
        else{
            return linearSearch(arr,target,index-1);
        }
    }


    static ArrayList findAllIndex(int[] arr, int target, int index,ArrayList<Integer> list){
        if(index == arr.length-1){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        return findAllIndex(arr,target,index+1,list);
    }

    // find all the indexes without using static arrayList

    static ArrayList findAllIndex2(int[] arr, int target,int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length-1){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> listOfAbove = findAllIndex2(arr,target,index+1);
        list.addAll(listOfAbove);
        return list;
    }
}
