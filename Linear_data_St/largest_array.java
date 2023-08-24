package linear_data_St;

public class largest_array {
    public static void main(String[] args) {
        int[] d={5,33,77,4,5};
        
            int largest=d[0];
            int loc=0;
        
        for(int i=0; i<d.length; i++)
        {
            if(largest<d[i])
            {
             largest=d[i];   
             loc=i;
            }
        }
        System.out.println("Location of largest is = "+loc);        
    }   
}
