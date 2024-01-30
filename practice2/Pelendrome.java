package dsa;

public class Pelendrome {
    public static void main(String[] args) {
        String s="eye";

        char[] reversed=new char[s.length()];

        int count=0;
        int count2=0;
        
        for(int i=s.length()-1; i>=0; i--)
        {
            reversed[i]=s.charAt(count++);
            
        }
        
        for(int i=0; i<s.length(); i++)
        {
           if(reversed[i]==s.charAt(i))
           {
               count2++;
           }
        }
        
        if (count2==s.length()) {
            System.out.println("Pelendrome");
        } else {
            System.out.println("Not");
        }

}
}
