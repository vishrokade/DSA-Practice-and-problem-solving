package StackQueue;

import static StackQueue.BinaryTreeBuilder.buildTree;

public class LevelOrderTraversing {

    public static void main(String[] args) {
        int[] nums = {3,9,20,15,7};
        TreeNode root = buildTree(nums);
    }
}
