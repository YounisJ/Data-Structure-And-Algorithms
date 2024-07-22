package dsa;

import java.util.Stack;

public class DS_100_Stack {

    public static void main(String[] args) {
        
        // DS_100_Stack Data structure
        
       Stack<String> Books=new Stack<String>();
       
       Books.push("Java");
       Books.push("Cap's");
       Books.push("Discrete");
       Books.push("Applied physics");
       
       
        System.out.println("");
        System.out.println("Is Stack empty : "+Books.empty());
        System.out.println("Poped           : "+Books.pop());
        System.out.println("At Top        : "+Books.peek());
        System.out.println("All in stack   : "+Books);
        System.out.println("Cap's At      : "+Books.search("Cap's"));
        
       
        
    }
    
}
