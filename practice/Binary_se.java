package practice;

import java.util.Arrays;

public class Binary_se {
    public static void main(String[] args) {
        int[] d={4,6,5,2};
        
        int[] link={1,2,3,9};
        int ptr=0;
        
        while(ptr!=9)
        {
            System.out.print(d[ptr]);
            ptr=link[ptr];
        }
    }
    
}
