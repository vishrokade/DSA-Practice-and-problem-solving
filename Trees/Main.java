package Trees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        BinaryTree t1 = new BinaryTree();
//        t1.populate(new Scanner(System.in));
//        t1.display();

        BST tree = new BST();
        int[] nums = {5,2,7,1,4,6,9,8,3,10};
        tree.populate(nums);
        tree.display();
    }
}
