package practice;

public class linear_search {
    public static void main(String[] args) {
        
        int[] d={1,2,3,4,5};
        
        int k=0;
        int item=3;
        int loc =0;
        
        while(k<d.length)
        {
            if(item==d[k])
            {    
            loc=k;
            }
            k++;
        }
        
        System.out.println("Location "+loc);
        
    }
    
}
