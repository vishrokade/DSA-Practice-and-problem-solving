package StackQueue;

import java.util.LinkedList;
import java.util.Queue;

import static StackQueue.BinaryTreeBuilder.buildTree;

public class BFSForTree {
    public static void main(String[] args) {
        int[] nums = {0,1, 2, 3, 4, 5, 6, 7,100};
        TreeNode root = buildTree(nums);
        // perform any operations on the tree here

        System.out.println("Level order traversing");
        display(root);
        System.out.println("\nDFS preorder traversing");
        preorder(root);
        System.out.println("\nDFS inorder traversing");
        inorder(root);
        System.out.println("\nDFS postorder traversing");
        postorder(root);
    }

    static void display(TreeNode root){

        if (root == null){
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){

            TreeNode curr = queue.poll();
            System.out.print(curr.val+  "->");

            if (curr.left != null) {
                queue.add(curr.left);
            }

            if (curr.right != null) {
                queue.add(curr.right);
            }
        }

    }
    //dfs

    static void preorder(TreeNode root){
        if (root == null){
            return;
        }
        preorder(root.left);
        System.out.print(root.val+" ->");
        preorder(root.right);
    }

    static void inorder(TreeNode root){
        if (root == null){
            return;
        }

        System.out.print(root.val + " ->");
        inorder(root.left);
        inorder(root.right);
    }
    static void postorder(TreeNode root){
        if (root == null){
            return;
        }


        inorder(root.left);
        inorder(root.right);
        System.out.print(root.val + " ->");
    }
}
