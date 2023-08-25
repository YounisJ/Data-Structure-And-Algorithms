
package Binary;

public class Binary_Search_Alph {
    public static void main(String[] args) {
        
        char[] d={'a','d','e','c','b'};
        int beg=0;
        int end=d.length-1;
        
        int mid=(beg+end)/2;
        
        char item='d';
        
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
