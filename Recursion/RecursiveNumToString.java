package Recursion;

public class RecursiveNumToString {
    static void dnum(int a)
    {
        String StNum[]={"Zero","One","Two","Three","Four","Five","Six","Seven", "Eight", "Nine"};
        
        if(a>0)
        {
        int Mod=a%10;
        a=a/10;
        
        System.out.println(StNum[Mod]);
        dnum(a);
            
        }   
    }
    public static void main(String[] args) {
        
        int a=432;
        dnum(a);
    }
}
