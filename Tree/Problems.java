package Tree;

import java.util.ArrayList;
import java.util.List;

public class Problems {
    // Problem: "Invert a Binary Tree"

    // To get started, try this classic problem that introduces you to tree
    // structures and requires a recursive approach.

    // Problem Statement:

    // Given the root of a binary tree, invert the tree, and return its root.

    // Example:

    // If the input tree is:

    //    4
    //   / \
    //   2 7
    // / \ / \
    // 1 3 6 9

    public static void main(String[] args) {
        // solution 1:
        TreeNode root = new TreeNode(4,
                            new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                            new TreeNode(7, new TreeNode(6), new TreeNode(9))
                        );

        // Create object to call non-static method
        Problems solution = new Problems();
        List<Integer> preorderResult = solution.preorderTraversal(root);

        // print result
        System.out.println("Preorder Traversal: " + preorderResult);


    }

    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        // call recursive function
        preorderHelper(root, result);
        return result;
    }
    
    public void preorderHelper(TreeNode node, List<Integer> result){
        // Base condition
        if(node == null){
            return;
        }

        // visit rootnode
        result.add(node.value);

        //recurse on left child
        preorderHelper(node.left, result);

        //recurse on right child
        preorderHelper(node.right, result);

    }
}

class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;

    // Constructor to initialize a node with a value
    TreeNode(int value){
        this.value = value;
    }

    // Optional: Constructors for a node with left/right children
    TreeNode(int value, TreeNode left, TreeNode right){
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
