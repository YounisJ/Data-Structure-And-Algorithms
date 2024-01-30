/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

import java.util.Arrays;

public class merge {
    
    static void merge(int d[], int lb, int ub)
    {
        if(lb<ub)
        {
            int mid=(lb+ub)/2;
            merge(d, lb, mid);
            merge(d, mid+1, ub);
            
            me(d,lb,ub,mid);
        }
    }
    static void me(int d[],int lb,int ub,int mid){
        int i,j,k;
        i=lb;
        k=lb;
        j=mid+1;
        
        int temp[]=new int[20];
        
        while(i<=mid && j<=ub)
        {
            if(d[i]<d[j])
            {
                temp[k]=d[i];
                i++;
               
            }
            else
            {
                temp[k]=d[j];
                j++;
               
            }
            k++;
            
        }
        if(i>mid)
        {
            while(j<=ub)
            {
                temp[k]=d[j];
                j++;
                k++;
            }
        }
        else
        {
            while(i<=mid)
            {
                temp[k]=d[i];
                i++;
                k++;
            }
        }
        
        for(int a=lb; a<=ub; a++)
        {
            d[a]=temp[a];
            
        }
    }
    
    public static void main(String[] args) {
        int v[]={9,8,7,6,5,4,3,2,1};
        
        merge(v, 0, v.length-1);
        
        System.out.println(Arrays.toString(v));
        
    }
}
