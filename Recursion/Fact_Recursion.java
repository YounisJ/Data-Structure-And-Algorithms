package Recursion;
public class Fact_Recursion {
    
    static int Factorial(int num)
    {
        if (num==0 || num==1) {
            return 1;
            
        } else {
            return num*Factorial(num-1);
        }   
    }
    public static void main(String[] args) {
     
        System.out.println(Factorial(5));
    }
}
