package practice;

public class Unique_NotUnique {
    public static void main(String[] args) {
        
        String str="The quick brown fox jumps over a lazy dog.";
        int countNotUnique=0;
        
        for(int i=0; i<str.length(); i++)
        {
            for(int j=1+i; j<str.length(); j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    countNotUnique++;
                }
            }
        }
        if(countNotUnique>0)
        {
            System.out.println("Not Unique");
        }
        else
        {
            System.out.println("Unique");
        }
    }
}
