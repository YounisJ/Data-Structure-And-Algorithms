package linear_data_St;

public class smallest_in_array {
    public static void main(String[] args) {
        
        int[] d={32,23,77,55,44};
        int k=0;
        int item=d[k];
        int index=0;
        
        while(k<d.length)
        {
            if(item>d[k])
            {
                item=d[k];
                index=k;
            }
            k=k+1;
        }
        System.out.println("Item = "+item);
        System.out.println("Location = "+index);
        
    }
   
}
