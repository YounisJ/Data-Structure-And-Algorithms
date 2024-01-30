package Recursion;

public class Fib_Recursion {
    
    static int feb(int num)
    {
        if(num == 1 || num==0)
        {
            return num;
        }
        else
        {
            return feb(num-1)+feb(num-2);
        }
    }
    public static void main(String[] args) {
        
        int num=41;
        for(int m=0; m<num; m++){
        System.out.println(m+" : "+feb(m)+" ");       
        }
    }  
}
