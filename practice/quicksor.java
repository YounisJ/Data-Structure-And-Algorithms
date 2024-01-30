package practice;

import java.util.Arrays;

public class quicksor {
    
    
    static void table(int num,int start,int end)
    {
        
        if(start<=end)
        {
            
            System.out.println(num+"*"+start+"="+start*num);
            start++;
            table(num,start,end);
        }
    }
        
    
    public static void main(String[] args) {
        
//        int d[]={3,6,4,7,5,8,1,9,2};

        table(5,1,10);
        
//        System.out.println(Arrays.toString(d));
    }
    
}
