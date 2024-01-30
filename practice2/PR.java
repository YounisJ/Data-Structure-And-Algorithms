package dsa;

import java.util.Arrays;

public class PR {
    public static void main(String[] args) {
        
        int d[]={21,45,76,326,68,24,0,7,23,64,31};
        //insertion sort
        
        int k=1;
        
        while(k<d.length)
        {
            int item=d[k];
            int j=k-1;
            
            while(j>=0 && item<d[j])
            {
                d[j+1]=d[j];
                j--;
            }
        }
        
        
        System.out.println(Arrays.toString(d));
        
        
    }
    
}
