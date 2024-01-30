package Link_List;

public class Insertion_in_linkedList {
    
    public static void main(String[] args) {
        
        char data[]={'a','b','c','d'};
        int end=9;
        int link_adresses[]={0,1,2,end};
        
        int ptr=0;
        
        while (ptr!=0)
        {
            System.out.println(data[ptr]);
            ptr=link_adresses[ptr];
        }
            
            
        }
        
    }