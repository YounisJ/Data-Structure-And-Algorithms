package linear_data_St;

public class linearSearch {
    public static void main(String[] args) {
        
        char[] d={'a','b','c','d','e','b'};
        
        int loc=0;
        char Desireditem='b';
        
        for(int i=0; i<d.length; i++)
        {
            if(Desireditem==d[i])
            {
                loc=i;
                System.out.println(loc);
            }
        }}}
