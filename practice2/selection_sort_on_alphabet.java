package dsa;

import java.util.Arrays;

public class selection_sort_on_alphabet {
    public static void main(String[] args) {
        
        char[] d={'c','e','b','a','d'};
        
        int i=0,j=0;
        
        char store=' ';
        System.out.println(Arrays.toString(d));
        
        while(i<d.length)
        {
            j=i+1;
            while (j<d.length) {
            if(d[i]>d[j])
            {
                store=d[i];
                d[i]=d[j];
                d[j]=store;
            }
                
            j++;
            }
        i++;
        }
        System.out.println(Arrays.toString(d));
        
        
        
    }
    
}
