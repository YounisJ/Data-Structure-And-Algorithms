package Sorting;

import java.util.Arrays;
System.out.print("");
public class bubble_sort {
    public static void main(String[] args) {
        
        char[] d = {'d', 'c', 'b', 'e', 'a'};
        char store = ' ';
        
        System.out.println("Unsorted " + Arrays.toString(d));
        
        int k = 0;
        
        while (k < d.length) {            
            int j = 0; 
            while (j < d.length - k - 1) {
                
                if (d[j] > d[j + 1]) {
                    store = d[j];
                    d[j] = d[j + 1];
                    d[j + 1] = store;
                }
                j++;
            }
            k++;
        }
        
        System.out.println("Sorted " + Arrays.toString(d));
    }
}
