package dsa;

import java.util.Arrays;

public class Insertion_Sorting {
    public static void main(String[] args) {
        
        int[] d={4,2,8,5,9,1,3,6};
        int k=1;
        
        while(k<d.length)
        {
            int temp=d[k];
            int j=k-1;
            
            while(j>=0 && temp<d[j])
            {
                d[j+1]=d[j];        //index 1=index 0;            
             
                j--;
            }
            d[j+1]=temp;      //index 1=1;
            k++;
            
        }
        System.out.println(Arrays.toString(d));
        
    }
    
}
