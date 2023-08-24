package linear_data_St;

import java.util.Scanner;

public class Largest_among_3_Nums {
    public static void main(String[] args) {
        int a,b,c;
        
        Scanner input=new Scanner(System.in);
        System.out.print("A : ");
        a=input.nextInt();
        System.out.println("");
        System.out.print("B : ");
        b=input.nextInt();
        System.out.println("");
        System.out.print("C : ");
        c=input.nextInt();
        
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("A is Largest");
            }
            else
            {
                System.out.println("C is Largest");
            }
                       
        }
        else
        {
            if(b>c)
            {
                System.out.println("B is Largest");
            }
            else 
            {
            System.out.println("C is Largest");
            }
        }
               
    }
    
}
