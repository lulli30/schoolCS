package dtatask;

import java.util.Scanner;

/**
 *
 * @author borabojg
 */

class treeNode{
    int data;
    treeNode left;
    treeNode right;
    
    public treeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTreeExercise {
    static treeNode createBinaryTree(Scanner scanner){
        System.out.print("Enter the value of the root node: ");
        int rootValue = scanner.nextInt();
        treeNode root = new treeNode(rootValue);
        
        while(true){
            System.out.print("Enter the value for the left node: ");
            int leftValue = scanner.nextInt();
            root.left = new treeNode(leftValue);

            System.out.print("Enter the value for the right node: ");
            int rightValue = scanner.nextInt();
            root.right = new treeNode(rightValue);

            System.out.print("Do you want to add another node? [Y/N] ");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("Y")) {
            break;
            }
        }
        return root;
    }

    static int calculateHeight(treeNode node) {
        if (node == null) {
            return 0;
        } else {
            int leftHeight = calculateHeight(node.left);
            int rightHeight = calculateHeight(node.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        treeNode root = createBinaryTree(scan);
        
        int height = calculateHeight(root);
        System.out.println("Height of the binary tree: " + height);
    }
}
