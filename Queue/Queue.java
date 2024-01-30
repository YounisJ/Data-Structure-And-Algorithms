package Queue;

public class Queue {
    
    int n=5;
    int d[]=new int[n];
    int front=0;
    int rear=0;
    
    void Push(int item)
    {
        if(rear>n-1)
        {
            System.out.println("Overflow");
            System.exit(0);
        }
        else
        {
            d[rear]=item;
            rear++;
        }
    }
    
    void Pop()
    {
        if(front>=rear)
        {
            System.out.println("Underflow");
            System.exit(0);
        }
        else
        {
            d[front]=0;
            front++;
            
        }
    }
    
    void Peek()
    {
        if(front>=rear)
        {
            System.out.println("Queue is empty");
        }
        else
        {
        System.out.println(d[front]);
        }
    }
    
    
    public static void main(String[] args) {
        Queue Queue=new Queue();
        
        
        Queue.Push(1);
        Queue.Push(2);
        Queue.Push(3);
        
        Queue.Peek();
        
        Queue.Pop();
        Queue.Peek();
        
        Queue.Pop();
        Queue.Peek();
        
        Queue.Pop();
        Queue.Peek();
        
    }
}
