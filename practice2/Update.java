
package dsa;

import java.util.Scanner;

public class Update {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int[] arr={1,2,3,4,5,6};
        
        
            System.out.println("before replace");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        
        System.out.println("On which index you want to replace the number : ");
        int replaceIndex=input.nextInt();
        
        
        System.out.println("Which Number will you give : ");
        int replaceNum=input.nextInt();
        for(int i=0; i<arr.length; i++)
        {
         if(replaceIndex==i)
         {
             arr[i]=replaceNum;
         }
        }
        
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        
    }
    
}
