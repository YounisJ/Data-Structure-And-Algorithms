
package Binary;

public class Binary_search_num {
    public static void main(String[] args) {
        
        int[] d={1,2,3,4,5};
        int beg=0;
        int end=d.length-1;
        
        int mid=(beg+end)/2;
        
        int item=3;
        
        while(beg<=end && item != d[mid])
        {  if(item>d[mid])
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
                System.out.println("Item found on index : "+mid);
        }
        else{
            System.out.println("Item not found");
        }
    }
}
