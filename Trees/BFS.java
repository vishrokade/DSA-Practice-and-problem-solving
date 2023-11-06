package Trees;

import java.util.LinkedList;
import java.util.Queue;

class TN{
    int val;
    TN left;
    TN right;

    public TN(int val){
        this.val = val;
    }
}
public class BFS {

    public static void main(String[] args) {

        TN root = new TN(1);
        root.left = new TN(2);
        root.right = new TN(3);
        root.left.left = new TN(4);
        root.left.right = new TN(5);
        root.right.left = new TN(6);
        root.right.right = new TN(7);

        printInBFS(root);

    }

    static void printInBFS(TN root){
        if (root == null){
            return;
        }

        Queue<TN> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){

            TN temp = queue.poll();
            System.out.println(temp.val);

            if (temp.left != null){
                queue.add(temp.left);
            }

            if (temp.right != null){
                queue.add(temp.right);
            }
        }
    }
}
