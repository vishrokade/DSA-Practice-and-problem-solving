package StackQueue;

public class BinaryTreeBuilder {
    private static TreeNode buildTreeHelper(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = buildTreeHelper(nums, start, mid - 1);
        node.right = buildTreeHelper(nums, mid + 1, end);
        return node;
    }

    public static TreeNode buildTree(int[] nums) {
        return buildTreeHelper(nums, 0, nums.length - 1);
    }
}
