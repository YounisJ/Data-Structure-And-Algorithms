package DSA_LAB;

public class M_Younis_MidLabTask {
    public static void main(String[] args) {
        int d[]={10,11,12,13,14,15,16,17};
        
        int start=0;
        int end=d.length-1;
        int mid=(start+end)/2;
        int item=12;
        
        while(start<=end && item!=d[mid])
        {
            if(item>d[mid])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
            mid=(start+end)/2;
        }
        
        if(item ==d[mid])
        {
            System.out.println("Location = "+mid);
        }
        else
        {
            System.out.println("Item not found");
        }
        
    }
}