package Stack;

import java.util.Arrays;

class Stack
{
    static int size;
    static int maxstack;
    static int top;
    static int[] stack;
    
    Stack(int Capacity)
    {
        maxstack=Capacity;
        top=-1;
        size=0;
        stack=new int[Capacity];
    }
    
    void push(int num)
    {
        
        if(top>=maxstack)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            stack[++top]=num;
            size++;
        }
            
    }
    
    int pop()
    {
        if(top<0)
        {
            System.out.println("Underflow");
        }
        else
        {
            System.out.println("Removed element "+stack[top]);
            stack[top]=0;
        }
            size--;
            System.out.println("Now size is "+size);
            return stack[top--];
            
        
    }
    
    void display()
    {
        if(size<0)
        {
            System.out.println("Stack is empty");
        }
        else
        {
        for(int i=0; i<size; i++)
        {
            System.out.print(stack[i]+" ");
        }
        System.out.println();
        }
    }
    void peak()
    {
        System.out.println(stack[top]);
    }
    void clear()
    {
        for(int i=0; i<size; i++)
        {
         stack[i]=0;
//         size--;
        }
        size=-1;
        System.out.println("[]");
    }
}


public class stack_by_sagar {
    public static void main(String[] args) {
        
        Stack stack =new Stack(10);
        
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
//        stack.pop();
        
        stack.clear();

        stack.display();
//        stack.peak();
    }
}
