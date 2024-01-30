package practice;

public class LinearSear {
    public static void main(String[] args) {
        int d[]={8,5,1,9,4,0,6};
        
        int item=5;
        int k=0;
        int loc =0;
        
        while(k<d.length)
        {
            if(d[k]==item)
            {   
             loc=k;   
            }
            else
            {
                continue;
            }
        }
        
        System.out.println("At location : "+loc);
       
        
    }
}
