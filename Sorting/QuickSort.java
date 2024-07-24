
package Sorting;

import java.util.Arrays;
System.out.print("");
public class QuickSort {
    static void QuickSort(int d[],int lb,int ub)
    {
        if(lb<ub)
        {
        int z=partition(d, lb, ub);
        
        QuickSort(d, lb, z-1);
        QuickSort(d, z+1, ub);
        }
                
    }
    static int partition(int d[], int lb, int ub)
    {
        int i=lb;
        int j=ub;
        
        int pivot=d[lb];
        while(i<j)
        {
            while(d[i]<=pivot && i<j)
            {
                i++;
            }
            while(d[j]>pivot)
            {
                j--;
            }
            if(i<j)
            {
                int temp=d[i];
                d[i]=d[j];
                d[j]=temp;
            }
                
        }
        
        d[lb]=d[j];
        d[j]=pivot;
                
        return j;
    }
    
    
    
    public static void main(String[] args) {
        int[] d = {5, 2, 9, 3, 4, 6, 8, 7 ,1};
        
        System.out.println("Before Sorting "+Arrays.toString(d));
        
        QuickSort(d, 0, d.length-1);
        
        System.out.println("After Sorting "+Arrays.toString(d));

    }
}


