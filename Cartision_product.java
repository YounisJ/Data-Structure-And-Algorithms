package dsa;

public class Cartision_product {
    public static void main(String[] args) {
        
        char[] arr1={'a','b'};
        char[] arr2={'c','d'};
        
        
        for(int i=0; i<arr1.length; i++)
        {
            for(int j=0; j<arr2.length; j++)
            {
                if(j==0 || i==0)
                {
                System.out.print("("+arr1[i]+","+arr2[j]+")"+",");   
                }
                else
                {
                System.out.print("("+arr1[i]+","+arr2[j]+")");    
                }
            }
        }
        
        
    }
        
}
