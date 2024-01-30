package dsa;

public class Factorial {
    static int fib(int num)
    {
     if(num==0 || num==1)
     {
         return num;
     }
     else
     {
         return fib(num-1)+fib(num-2);
     }
    }
    public static void main(String[] args) {
    
        int length=5;
        int k=0;
        
        while(k<=length)
        {
            System.out.println(fib(k));
            k++;
        }
        
        
        
    }
    
}
