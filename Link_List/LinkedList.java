/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Link_List;

public class LinkedList {

    static class Node{
        int data;   // Node Part One
        Node next;  // Node Part Two

        // Constructor
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static Node head = null;
    
    static void Creation_of_new_Node(int data){
            Node new_node = new Node(data);

            if(head==null){
                head=new_node;
            }
            else{
                new_node.next=head;
                head=new_node;
            }
    }

    static void Traverser(){
        Node temp=head;
        if(temp==null){
            System.out.println("Node doesnot exit");
        }
        else{
            System.out.print("Linked List Data : ");
            while (temp!=null) {
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
        }
    }


    public static void main(String[] args) {
//        LinkedList ll = new LinkedList();

        Creation_of_new_Node(10);
        Creation_of_new_Node(20);
        Creation_of_new_Node(30);
        Creation_of_new_Node(40);
        Creation_of_new_Node(50);

        
        Traverser();
    }    
}