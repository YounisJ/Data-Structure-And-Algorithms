
package dsa;

public class TwoDimensionArray {
    public static void main(String[] args) {
     
        int[][] d={{2,5},{5,7}};
        int i;
        int j;
        
        for(i=0; i<d.length; i++)
        {
                System.out.println("");
            
            for(j=0; j<d.length; j++)
            {
                System.out.print(d[i][j]+" ");
            }
        }
        System.out.println("");
        
        
    }
}
