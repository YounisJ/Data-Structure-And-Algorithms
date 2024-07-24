package Sorting;

import java.util.Arrays;
System.out.print("");
public class HeapSortAscending {
    
    static void HeapSort(int[] d){
   
        int i=(d.length/2)-1;
        int Root =0;
        while(i>=0)
        {
            heapify(d, d.length, i);
            i--;
        }
        
        int j=(d.length)-1;
        while(j>=0)
        {
            int temp=d[Root];
            d[Root]=d[j];
            d[j]=temp;
            
            heapify(d, j, 0);
            j--;
        }
        
    }
    
    static void heapify(int[] d, int n, int i)
    {
        int Largest=i;
        int LeftchildInd=2*i+1;
        int RightchildInd=2*i+2;
        
        if(LeftchildInd<n && d[Largest]<d[LeftchildInd])
        {
            Largest=LeftchildInd;
        }
        if(RightchildInd<n && d[Largest]<d[RightchildInd])
        {
            Largest=RightchildInd;
        }
        if(Largest!=i)
        {
            int temp=d[i];
            d[i]=d[Largest];
            d[Largest]=temp;
            
            heapify(d, n, Largest);
        }
        
    }
    
    public static void main(String[] args) {
        
        int d[]={6,3,9,7,1,2,8};
        
        HeapSort(d);
        
        System.out.println(Arrays.toString(d));
        
    }
    
}
