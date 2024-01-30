package Sorting;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {        

        int[] d={6,8,3,4,9,10,1,2,7,5};
        
        int k=1;
        System.out.println("Before Sorting : "+Arrays.toString(d));
        
        while(k<d.length)
        {
            int item=d[k];
            int j=k-1;
            
            while(j>=0 && item<d[j])
            {
                d[j+1]=d[j];
                j--;
            }
            d[j+1]=item;
            k++;
        }
        
        System.out.println("After Sorting  : "+Arrays.toString(d));
        
        
    }
    
}
