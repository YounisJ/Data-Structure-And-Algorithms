package practice;

public class Largest_in_array {
    public static void main(String[] args) {
        
        int[] d={23,3,4,7,67};
    
        int largest=d[0];
        
        for(int i=0; i<d.length; i++)
        {
            if(largest<d[i])
            {
                largest=d[i];
            }
        }
        System.out.println(largest);
    }
    
}
