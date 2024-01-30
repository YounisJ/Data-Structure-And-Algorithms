package Sorting;

import java.util.Arrays;

public class MergeSort {
    
    static void MergeSort(int d[],int lb, int ub)       
    {
        if(lb<ub)
        {
            int mid=(lb+ub)/2;
            
            MergeSort(d, lb, mid);
            MergeSort(d, mid+1, ub);
            
            Merge(d,lb,mid,ub);
        }
    }
    
    static void Merge(int d[], int lb,int mid,int ub)
    {
        int i,j,k;
        i=lb;
        j=mid+1;
        k=lb;
        int store[]=new  int[20];
        
        while(i<=mid && j<=ub)
        {
            if(d[i]<d[j])
            {
                store[k]=d[i];
                i++;
                        
            }
            else
            {
                store[k]=d[j];
                j++;       
            }
            k++;
        }
        if(i>mid)
        {
            while(j<=ub)
            {
                store[k]=d[j];
                j++;
                k++;
            }
        }
        else
        {
            while(i<=mid)
            {
                store[k]=d[i];
                i++;
                k++;
            }
        }
        
       for(int a=lb; a<=ub; a++)
           {
            d[a]=store[a];
           }
       }
    
    
    
    public static void main(String[] args) {
        
        int d[]={4,2,7,6,1,3,8,5};
         
        MergeSort(d, 0, d.length-1);
        
        System.out.println(Arrays.toString(d));
        
    }

}