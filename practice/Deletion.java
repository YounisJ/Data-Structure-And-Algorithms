package practice;
import java.util.Arrays;

public class Deletion {
    public static void main(String[] args) {
        
        char[] d = {'a', 'c', 'd', 'e', '*'};
        
        System.out.println(Arrays.toString(d));
        
        int loc = 2;
        int i = loc;
        char item = '*';
        
        while (i < d.length - 1) {
            d[i] = d[i + 1];
            i = i + 1;
        }
        
        d[i] = item;
        
        System.out.println(Arrays.toString(d));
    }
}
