package dsa;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        
        int[] d={34,65,18,785,534,3};
        
        int store=0;
//        int count=0;
        
        for (int i = 0; i < d.length; i++) {
            for (int j = i+1; j < d.length; j++) {
                
                if (d[j]<d[i]) //(1<0)(2<0)(3<0)(4<0)
                {
                    store=d[i];
                    d[i]=d[j];
                    d[j]=store;
//                    System.out.println("Swaped "+d[i]+","+d[j]);
//                    System.out.println("after "+(++count)+" Swap "+Arrays.toString(d));
                    
                }
                
            }
            
        } 
        System.out.println(Arrays.toString(d));
    }
}
