/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

import linkedList.LinkedList;

/**
 *
 * @author Ali
 */
public class BST {
    
    public BST()
    {
    }
    
    public Node insert(int newData, Node root)
    {
        if(root == null)
        {
            root = new Node();
            root.data = newData;
        }
        else if(newData <= root.data)
            root.left = insert(newData, root.left);
            
        else
            root.right = insert(newData, root.right);
        
        return root;
    }
    
    public boolean search(Node root, int data)
    {
        if(root == null)
            return false;
        
        else if(data == root.data)
            return true;
        else if(data < root.data)
            search(root.left, data);
        else if(data > root.data)
            search(root.right, data);
        
        return false;
    }
    
    /*
        Finds minimum value in tree using iterative method
    */
    public int min(Node root)
    {
        int minVal = -1;
        
        if(root != null)
        {
            minVal = root.data;
            Node newRoot = root;
            while(newRoot.left != null)
            {
                minVal = newRoot.left.data;
                newRoot = newRoot.left;
            }
        }
        
        return minVal;
    }
    
    /*
        Finds max value in tree using iterative method
    */
    public int max(Node root)
    {
        int maxVal = -1;
        
        if(root != null)
        {
            maxVal = root.data;
            Node newRoot = root;
            while(newRoot.right != null)
            {
                maxVal = newRoot.right.data;
                newRoot = newRoot.right;
            }
        }
        
        return maxVal;
    }
    
    /*
        Finds max value in tree using recursive method
    */
    public int findMaxRecursion(Node root)
    {
        int maxVal = -1;
        
        if(root != null)
        {
            maxVal = root.data;
            if(root.right != null)
                maxVal = findMaxRecursion(root.right);
            
        }
        return maxVal;
    }
    
    /*
        Finds min value in tree using recursive method
    */
    public int findMinRecursion(Node root)
    {
        int minVal = -1;
        
        if(root != null)
        {
            minVal = root.data;
            if(root.left != null)
                minVal = findMinRecursion(root.left);
            
        }
        return minVal;
    }
    
    /*
        Finds height of tree
    */
    public int heightOfTree(Node root)
    {
        int greater;
        if(root == null)
            return -1;
        else
        {
            int heightOfLeftTree = heightOfTree(root.left);
            int heightOfRightTree = heightOfTree(root.right);
            
            greater = maxOf(heightOfLeftTree, heightOfRightTree) + 1;
        }
        return greater;
    }
    
    private int maxOf(int val1, int val2)
    {
        if(val1 > val2)
            return val1;
        else
            return val2;
    }
    
    /*--------
        Depth first search methods
    --------*/
    
    /*
        Preorder <root> <left> <right>
    */
    
    public void preOrderTraversal(Node root)
    {
        if(root == null)
            return;
        
        System.out.print(root.data + ", ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    
    /*
        Inorder <left> <root> <right>
    */
    
    public void inOrderTraversal(Node root)
    {
        if(root == null)
            return;
        
        inOrderTraversal(root.left);
        System.out.print(root.data + ", ");
        inOrderTraversal(root.right);
    }
    
    /*
        Postorder <left> <right> <root>
    */
    
    public void postOrderTraversal(Node root)
    {
        if(root == null)
            return;
        
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + ", ");
    }
    
    /*
        Breath first search
        also known as level order traversal
    */
    private final LinkedList queue = new LinkedList();

    public void levelOrderTraversal(Node root)
    {
        if(root == null)
            return;
        
        queue.enqueue(root.left);
        queue.enqueue(root.right);
        
        System.out.print(root.data + ", ");
        levelOrderTraversal(queue.dequeue());
        
    }
    
    //Check if tree is a BST
    public Boolean isBST(Node root)
    {
        //return of root is null
        //check if value of root is less than value of right child
        //check if value of root is greater than left child
        //
        
        return true;
    }
}