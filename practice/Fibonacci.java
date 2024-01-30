
package practice;
public class Fibonacci {
    
    static int Fib(int num)
    {
        if(num==0 || num==1)
        {
            return num;
        }
        else
        {
            return Fib(num-1)+Fib(num-2);
        }
        
        
    }
    
    public static void main(String[] args) {
        
        int num=10;
        
        for(int i=0; i<num; i++)
        {
            System.out.println(Fib(i));
        }
            
        
        
    }
    
}
