package practice;

import java.util.Arrays;

public class Binary_search {
    public static void main(String[] args) {
        
        int[] d={34,324,54,76,23};
        Arrays.sort(d);
        
        int beg=0;
        int end=d.length-1;
        
        int item=54;
        
        int  mid=(beg+end)/2;
        
        while (beg<=end && item != d[mid]) {
        if(item>d[mid])
        {
            beg=mid+1;
        }
        if(item<d[mid])
        {
            end=mid-1;
        }
            
        mid=(beg+end)/2;
        }
       
        if(item==d[mid])
        {
            System.out.println("Item found at index "+mid);
        }
        else
        {
            System.out.println("not found");
        }
        
    }
    
}
