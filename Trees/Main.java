package Trees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree t1 = new BinaryTree();
        t1.populate(new Scanner(System.in));
        t1.display();
    }
}
