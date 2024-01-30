package practice;

public class OneTO5 {
    public static void main(String[] args) {
        
        String st="GIRGIT";
        int[] nums=new int[st.length()];
        
        for(int i=0; i<st.length(); i++ )
        {
            char store = st.charAt(i);
            System.out.println((int)(store));
            nums[i]=(int)(store)+i;
//            System.out.println(nums[i]);
        }
        
        System.out.println("");
        for(int store:nums)
        {
            System.out.println((store));
        }
//        System.out.println("");

//            int[] d={89,80,87,81,77,88,38,81};
            
            for(int i=0; i<nums.length; i++)
            {
                System.out.print((char)(nums[i]-i));
            }
        
    } 
}



