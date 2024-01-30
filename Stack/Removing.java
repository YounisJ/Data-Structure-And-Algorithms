package Stack;

import java.util.Arrays;

public class Removing {
    public static void main(String[] args) {
        
        char[] d={'a','b','c','d','e','f'};
        
        int top=d.length-1;
        
        
        while(top>=0)
        {
            if(top>=0)
            {
                d[top]='*';
                
                System.out.println(Arrays.toString(d));
                
                
            }
            else
            {
                System.out.println("Underflow");
                break;
            }
            top--;
        }
        
        
        
    }
    
}
