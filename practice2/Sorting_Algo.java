package dsa;

public class Sorting_Algo {
    public static void main(String[] args) {
        
       int[] arr={4,7,3,5};
       
       for(int k=0; k<arr.length; k++)
       {
           int i=0;
           int store=0;
           for(int j=1; j<arr.length; j++)
           {  
             if(arr[i]>arr[j])
             {
                 store=arr[i];
                 arr[i]=arr[j];
                 arr[j]=store;
             }
             i++;
           }
       }
        
       for(int store:arr)
       {
           System.out.print(store+"  ");
       }
        System.out.println("");

    }
}
