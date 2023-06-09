import java.util.*;
public class missingnumber {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
       ArrayList a=new ArrayList();
       Collections.sort(A); 
        for(int i=0;i<A.size()-1;i++)
        {
            if(A.get(i)==A.get(i+1))
            {
                a.add(A.get(i));
                
          
            }
           int dif=A.get(i+1)-A.get(i);
            if(dif>1)
            {
             
               a.add(A.get(i)-1);
            }
        }
        
       
       return a;
    }


    public static void main(String args[])

    {

      
        ArrayList c=repeatedNumber(Arrays.asList(new Integer[]{2,2,4}));
    }
}
