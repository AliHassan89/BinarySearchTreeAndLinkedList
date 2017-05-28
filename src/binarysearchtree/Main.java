/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

import bst.Node;
import bst.BST;
/**
 *
 * @author Ali
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Node root = null;
        BST binaryTree = new BST();
        
        root = binaryTree.insert(15, root);
        root = binaryTree.insert(18, root);
        root = binaryTree.insert(9, root);
        root = binaryTree.insert(12, root);
        root = binaryTree.insert(17, root);
        root = binaryTree.insert(25, root);
        root = binaryTree.insert(4, root);
        root = binaryTree.insert(28, root);
        
        System.out.println("Max through iteration: "+binaryTree.max(root));
        System.out.println("Min through iteration: "+binaryTree.min(root));
        
        System.out.println("Max through recursion: "+binaryTree.findMaxRecursion(root));
        System.out.println("Min through recursion: "+binaryTree.findMinRecursion(root));
        
        System.out.println("Height of tree is: "+binaryTree.heightOfTree(root));
        
        System.out.println("Depth First Search");
        System.out.print("Pre-order traversal: ");
        binaryTree.preOrderTraversal(root);
        System.out.println("");
        System.out.print("In-order traversal: ");
        binaryTree.inOrderTraversal(root);
        System.out.println("");
        System.out.print("Post-order traversal: ");
        binaryTree.postOrderTraversal(root);
        System.out.println("");
        System.out.println("Breath first search: ");
        System.out.print("Level-order traversal: ");
        binaryTree.levelOrderTraversal(root);
        System.out.println("");        
    }
}
