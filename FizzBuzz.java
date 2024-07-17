package dsa;

public class FizzBuzz {
    //
    public static void main(String[] args) {
        int k=1;
        
        while(k<100)
        {
            if (k%3==0 && k%5==0) {
                System.out.println("FizzBuzz");
            }
            else if(k%3==0)
            {
                System.out.println("Fizz");
            }
            
            else if(k%5==0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(k);
            }
            k++;
//
        }
    }
    
}
