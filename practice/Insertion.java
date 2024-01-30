package practice;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        
        char[] d={'a','c','d','e','*'};
        
        char item='b';
        int loc=1;
        
        int i=d.length-1;
        
        System.out.println(Arrays.toString(d));
        while(i>loc){
            d[i]=d[i-1];
            i--;
        }
        d[loc]=item;
        
        System.out.println(Arrays.toString(d));
    }
    
}
