
package dsa;

import java.util.Arrays;

public class swap {
    
    static void mergesort(int d[],int lb,int ub)
    {
        if(lb<ub)
        {
            int mid =(lb+ub)/2;
            
            mergesort(d, lb, mid);
            mergesort(d, mid+1, ub);
            
            Merge(d,lb,mid,ub);
        }
    }
    
    static void Merge(int d[],int lb,int mid,int ub)
    {
        int i,j,k;
        
        i=lb;
        j=mid+1;
        k=lb;
        
        int store[]=new int[20];
        
        while(i<=mid && j<=ub)
        {
            if(d[i]<d[j])
            {
                store[k]=d[i];
                k++;i++;
            }
            else
            {
                store[k]=d[j];
                k++;j++;
            }
        }
        
        if(i>mid)
        {
            while(j<=ub)
            {
                store[k]=d[j];
                j++;k++;
            }
        }
        else
        {
            while(i<=mid)
            {
                store[k]=d[i];
                i++; k++;
            }
        }
        
        for(int a=lb; a<=ub; a++)
        {
            d[a]=store[a];
        }
        
    }
    
    
    
    public static void main(String[] args) {
        
        int d[]={9,8,7,6,5,4,3,2,1};
        
        mergesort(d,0,d.length-1);
        
        System.out.println(Arrays.toString(d));
        
     
        
    }
    
}
