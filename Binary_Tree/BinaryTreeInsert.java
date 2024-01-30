package Binary_Tree;

import java.util.Random;

public class BinaryTreeInsert   
{  
    static class Node   
    {  
        Node left;  
        Node right;  
        int value;  
        public Node(int value)   
        {  
            this.value = value;  
        }  
    }  
    public void run()   
    {  
        Node rootnode = new Node(1);  
        System.out.println("Building tree with root value " + rootnode.value);  
        System.out.println("=================================");  
        insert(rootnode, 11);  
        insert(rootnode, 15);  
        insert(rootnode, 16);  
        insert(rootnode, 23);  
        insert(rootnode, 79);  
//            Random obj=new Random();
//
//            for (int i=1; i<200; i++){
//                
//                insert(rootnode,obj.nextInt(1, 200 ));
//            }
    }  
    public void insert(Node node, int value)   
    {  
        if (value < node.value)   
        {  
            if (node.left != null)   
            {  
                insert(node.left, value);  
            } else   
            {  
                System.out.println("  Inserted " + value + " to left of Node " + node.value);  
                node.left = new Node(value);  
            }  
        }   
        else if (value > node.value)   
        {  
            if (node.right != null)   
            {  
                insert(node.right, value);  
            } else   
            {  
                System.out.println("  Inserted " + value + " to right of Node " + node.value);  
                node.right = new Node(value);  
            }  
        } 
        
    }
    public static void main(String[] args)   
    {  
        new BinaryTreeInsert().run();  
    }  
    
} 
