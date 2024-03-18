package Trees;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class recoverBST {

    private TreeNode firstIncorrectNode;
    private TreeNode secondIncorrectNode;
    private TreeNode prevNode;

    public void recoverTree(TreeNode root) {
        // Initialize variables
        firstIncorrectNode = null;
        secondIncorrectNode = null;
        prevNode = new TreeNode(Integer.MIN_VALUE); // Initialize prevNode to the smallest possible value

        // Perform in-order traversal to identify swapped nodes
        traverseTree(root);

        // Swap values of the identified nodes
        int temp = firstIncorrectNode.val;
        firstIncorrectNode.val = secondIncorrectNode.val;
        secondIncorrectNode.val = temp;
    }

    private void traverseTree(TreeNode node) {
        if (node == null) {
            return;
        }

        // In-order traversal
        traverseTree(node.left);

        // Check for swapped nodes
        if (firstIncorrectNode == null && node.val < prevNode.val) {
            firstIncorrectNode = prevNode;
        }

        if (firstIncorrectNode != null && node.val < prevNode.val) {
            secondIncorrectNode = node;
        }

        prevNode = node;

        traverseTree(node.right);
    }

    public static void main(String[] args) {
        // Example usage
        recoverBST recoverBST = new recoverBST();

        // Construct a BST with two swapped nodes
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(2);

        // Print the original BST
        System.out.println("Original BST:");
        printInOrder(root);

        // Recover the BST
        recoverBST.recoverTree(root);

        // Print the recovered BST
        System.out.println("\nRecovered BST:");
        printInOrder(root);
    }

    private static void printInOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.val + " ");
        printInOrder(node.right);
    }
}
