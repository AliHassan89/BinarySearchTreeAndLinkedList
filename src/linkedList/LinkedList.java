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
public class LinkedList {
    
    private LinkedListNode head;
    
    public LinkedList()
    {
        head = new LinkedListNode();
    }
    
    public void addOnHead(Node newData)
    {
        LinkedListNode node = new LinkedListNode();
        node.data = newData;
        
        if(head.data == null)
        {
            head = node;
            head.next = null;
        }
        else
        {
            LinkedListNode temp = head;
            head = node;
            node.next = temp;
        }
    }
    
    public void addOnTail(Node newData)
    {
        LinkedListNode node = new LinkedListNode();
        node.data = newData;
        
        LinkedListNode nextNode = head;
        while(nextNode.next != null && nextNode.next.data != null)
        {
            nextNode = nextNode.next;
        }
        nextNode.next = node;
    }
    
    public void printList()
    {
        for(LinkedListNode i=head.next;; i=i.next)
        {
            System.out.println(i.data);
            if(i.next==null)
                break;
        }
    }
    
    public Node dequeue()
    {
        if(head.next == null)
            return null;
        
        Node val = head.next.data;
        head.next = head.next.next;
        
        return val;
    }
    
    public void enqueue(Node data)
    {
        addOnTail(data);
    }
}
