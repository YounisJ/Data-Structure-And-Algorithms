//
//package Link_List;
//
//public class PracticeLinkedList {
//    
//    static class Node
//    {
//        int data;
//        Node next;
//        
//        Node(int data)
//        {
//            this.data=data;
//            this.next=null;
//        }
//    }
//    
//    static Node head=null;
//    
//    static void CreateNode(int data)
//    {
//        Node NewNode=new Node(data);
//        
//        if(head==null)
//        {
//            head=NewNode;
//        }
//        else
//        {
//            NewNode.next=head;
//            head=NewNode;
//        }
//        
//    }
//    
//    static void traverse()
//    {
//        Node temp=head;
//        if (temp==null)
//        {
//            System.out.println("Node Doesnt Exist");
//        }
//        else
//        {
//             while(temp!=null)
//             {
//                 System.out.print(temp.data+" ");
//                 temp=temp.next;
//             }
//             System.out.println("");
//        }
//            
//    }
//    public static void main(String[] args) {
//        
//        CreateNode(1);
//        CreateNode(2);
//        CreateNode(3);
//        CreateNode(4);
//        
//        traverse();
//    }
//    
//}
