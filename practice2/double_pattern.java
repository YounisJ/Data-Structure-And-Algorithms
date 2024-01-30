package dsa;

public class double_pattern {
    public static void main(String[] args) {
        
        
//        for(int i=1; i<6; i++)
//        {
//            for(int j=1; j<i+1; j++)
//            {
//                
//                System.out.print(" *");
//                
//            }
//            System.out.println(" ");
//        }
//        for(int i=1; i<=3; i++)
//        {
//            for(int j=i; j>=1; j--)
//            {
//                System.out.print(" *");
//            }
//            System.out.println(" ");
//        }
//        
        int n = 5; // Number of rows in the pattern

        for (int i = 1; i <= n; i++) {
            // Print leading asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Print spaces in the middle
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print("  ");
            }

            // Print trailing asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
    

    }
    
}