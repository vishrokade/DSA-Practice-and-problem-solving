package Trees;
//https://leetcode.com/problems/find-largest-value-in-each-tree-row/description/
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindMaxFromEachRow {
    public static void main(String[] args) {

        TN root = new TN(1);
        root.left = new TN(2);
        root.right = new TN(3);
        root.left.left = new TN(4);
        root.left.right = new TN(5);
        root.right.left = new TN(6);
        root.right.right = new TN(7);

        System.out.println(findMax(root));
    }

    static List<Integer> findMax(TN root){

        if (root == null){
            return new ArrayList<>();
        }

        ArrayList<Integer> ans = new ArrayList<>();
        Queue<TN> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){

            int size = queue.size();
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < size; i++){

                TN temp = queue.poll();
                max = Math.max(temp.val,max);

                if (temp.left != null){
                    queue.add(temp.left);
                }
                if (temp.right != null){
                    queue.add(temp.right);
                }
            }
            ans.add(max);
        }

        return ans;
    }
}
