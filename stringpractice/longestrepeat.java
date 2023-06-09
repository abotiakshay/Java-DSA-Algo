import java.util.*;

public class longestrepeat {
    static String s="AAAA";

    static int findsubstring(int i,int j,int constant)
    {
        
        
        HashMap<Character,Integer> map=new HashMap<>();
       String str= s.substring(i, j);

       for(int k=0;k<str.length();k++)
       {

            if(map.containsKey(str.charAt(k)))
            {
                map.put(str.charAt(k),map.get(str.charAt(k))+1);
            }
            else{
                map.put(str.charAt(k),1);
            }

       }
       int max=Integer.MIN_VALUE;

       for(Map.Entry<Character,Integer> entry:map.entrySet())
       {    

           max= Math.max(max,entry.getValue());

       }

       if((str.length()-max) <=constant  )
       {
        return max+constant;
       }
       else{
        return max;
       }





    }
    public static void main(String[] args) {
        
        int k=1;
       
        int max=Integer.MIN_VALUE;
       
        for(int i=0;i<s.length()-1;i++)
        {
            
            for(int j=i+1;j<s.length();j++)
            {
                int flag=findsubstring(i,j,k);

                if(k==0)
                {
                    max= Math.max(max,flag);
                }
                
                else{
                   max= Math.max(max,flag);
                }

            }

        }


System.out.println(max);


    }
}
