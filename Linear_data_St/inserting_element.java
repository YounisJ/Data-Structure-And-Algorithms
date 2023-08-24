package linear_data_St;
import java.util.Arrays;

public class inserting_element {
    public static void main(String[] args) {
        char[] d={'a','c','d','e',' '};
        
        int loc=1;
        char item='b';
        
        System.out.println(Arrays.toString(d));
        
        int k=4;
        
        while(k>1)
        {
            d[k]=d[k-1]; 
            k--;
        }        
        d[loc]=item;
        for(int i=0; i<5; i++)
        {
            System.out.println(d[i]);
        }}}