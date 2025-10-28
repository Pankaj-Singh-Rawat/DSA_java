package Tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // BinaryTree tree = new BinaryTree();
        // tree.populate(scanner);
        // // tree.display();
        // tree.prettyDisplay();̃

        // Binary Search Tree:
//        BST tree = new BST();
//        int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
//        tree.populate(nums);
//        tree.display();
//
//        System.out.println();
//
//        BST sortedTree = new BST();
//        System.out.println("Sorted array tree: ");
//        int[] sortedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//        sortedTree.populateSorted(sortedArray);
//        sortedTree.display();


        // AVL tree:
        AVL tree = new AVL();

        for (int i = 0; i < 1000; i++) {
            tree.insert(i);
        }

        System.out.println(tree.height());
    }
}
