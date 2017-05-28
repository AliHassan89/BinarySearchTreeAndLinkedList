/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedList;

import bst.Node;

/**
 *
 * @author Ali
 */
public class LinkedListNode {
    public Node data;
    public LinkedListNode next;
    
    public LinkedListNode()
    {
        data = new Node();
        next = null;
    }
}
