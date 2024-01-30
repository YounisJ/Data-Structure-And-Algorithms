package Sorting;

import java.util.Arrays;


public class Selection_Sort {
    public static void main(String[] args) {
        
        int[] d={6,3,8,2,1,7};
        
        int k=0,j=0;
        int store=0;
        
        System.out.println(Arrays.toString(d));
        
        while(k<d.length)
        {
            j=k+1;
            while(j<d.length)
            {
                if(d[k]>d[j])
                {
                 store=d[k];
                 d[k]=d[j];
                 d[j]=store;
                }
            j=j+1;
            }
            k=k+1;
        }
        System.out.println(Arrays.toString(d));
    }
}
