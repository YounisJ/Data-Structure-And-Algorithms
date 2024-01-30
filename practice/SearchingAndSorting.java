/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class SearchingAndSorting {
    
    
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
    
    
     static void Merge(int d[],int lb,int mid,int ub)
     {
           int i=lb;
           int j=mid+1;
           int k=lb;
           
           int x[]=new int[20];
           
           while(i<=mid && j<=ub)
           {
               if(d[i]<d[j])
               {
                   x[k]=d[i];
                   i++;
               }
               else
               {
                   x[k]=d[j];
                   j++;
               }
               k++; 
           }
           if(i>mid)
           {
               while(j<=ub)
               {
                   x[k]=d[j];
                   j++; k++;
               }
           }
           else 
           {
               while(i<=mid)
               {
                   x[k]=d[i];
                   i++; k++;
               }
           }
           
//           System.out.println(x[0]);
           
           
//           System.arraycopy(x, lb, d, lb,ub-lb+1);
           
           for(int a=lb; a<=ub; a++)
           {
//            System.out.println(lb);
               
               d[a]=x[a];
               
           }
        
     }
    
     
    public static void main(String[] args) {
    int[] d={3,7,4,6,1,9,8};
    
    
    
    MergeSort(d,0,d.length-1);
    
        System.out.println(Arrays.toString(d));
    
    }
    
}
