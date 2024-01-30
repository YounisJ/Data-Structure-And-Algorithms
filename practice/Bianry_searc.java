
package practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Bianry_searc {
    public static void main(String[] args) {
        
        int[] d={23,54,29,4,67};
        
        Arrays.sort(d);
        
        int item=4;
        
        int beg=0,end=d.length-1;
        int mid=(beg+end)/2;
        
        
        
        for(int i=0; i<d.length ; i++)
        {
            if(item>d[mid])
            {
                beg=mid+1;
            }
            else
            {
                end=mid-1;
            }
            mid=(beg+end)/2;
        }
        
        
        if(item==d[mid])
        {
            System.out.println(mid);
        }
        
        
    }
    
}
