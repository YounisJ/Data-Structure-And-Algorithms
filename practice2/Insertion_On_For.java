package dsa;

import java.util.Arrays;

public class Insertion_On_For {
    public static void main(String[] args) {
        
        int[] d={5,3,8,4,6,9,2,1,7};
        
        for(int i=1; i<d.length; i++)
        {
            int item =d[i];
            int j;
            for(j=i-1; j>=0 && item<d[j]; j--)
            {
                d[j+1]=d[j];
            }
            d[j+1]=item;
            
        }
        System.out.println(Arrays.toString(d));
                

       
        
    }
    
}
