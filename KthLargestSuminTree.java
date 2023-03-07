import java.util.Arrays;

public class KthLargestSuminTree {

    static  class TreeNode {
     int val;
   TreeNode left;
     TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
    }
  static long kthLargestLevelSum(TreeNode root, int k) {
            int levels = getHeight(root) + 1;
            if(k>levels){
                return -1;
            }
            long sum[]=new long[levels];
            calculateLevelSum(root, 0, sum);

            Arrays.sort(sum);


            return sum[sum.length-k];
    }
    static void calculateLevelSum(TreeNode node, int level, long sum[])
        {
            if (node == null)
                return;

            // Add current node data to the sum
            // of the current node's level
            sum[level] += node.val;

            // Recursive call for left and right sub-tree
            calculateLevelSum(node.left, level + 1, sum);
            calculateLevelSum(node.right, level + 1, sum);
        }
        static int getHeight(TreeNode root)
        {
            if (root.left == null && root.right == null)
                return 0;

            int left = 0;
            if (root.left != null)
                left = getHeight(root.left);

            int right = 0;
            if (root.right != null)
                right = getHeight(root.right);

            return (Math.max(left, right) + 1);
        }
}

