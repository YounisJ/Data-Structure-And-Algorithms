package dsa;

import java.util.Arrays;

public class InsertinSort {
    public static void main(String[] args) {
        
        int[] d={7,4,9,2,3,6,1};
        
        int k=1;
        
        while(k<d.length)
        {
            int item =d[k];
            int j=k-1;
            while (j>=0 && item<d[j] ) {
                d[j+1]=d[j];
                j--;
                
            }
            d[j+1]=item;
            k++;
        }
        System.out.println(Arrays.toString(d));
        
    }
    
}
