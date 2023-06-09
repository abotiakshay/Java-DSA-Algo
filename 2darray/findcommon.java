import java.util.ArrayList;
import java.util.*;

public class findcommon {
    public static void main(String[] args) {

       int mat[][] = { {1, 2, 3, 4, 5},
        {2, 4, 5, 8, 10},
        {3, 5, 7, 9, 11},
        {1, 3, 5, 7, 9},
      };


      
        

        
       
            HashMap<Integer,Integer> mapmain=new HashMap<>();
            for (int j = 0; j < mat[0].length; j++) {

                mapmain.put(mat[0][j],1);


            }

            
        


        for (int i = 1; i < mat.length; i++) {
            HashMap<Integer,Integer> map=new HashMap<>();
            for (int j = 0; j < mat[i].length; j++) {

                map.put(mat[i][j],1);


            }
           
            for(Map.Entry<Integer,Integer> entry:map.entrySet())
            {
                if(mapmain.get(entry.getKey())!=null)
               {
                        mapmain.put(entry.getKey(), mapmain.get(entry.getKey())+1);

                        

               }

            }
            
           
        }
        int f=0;
        int k=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry:mapmain.entrySet())
            {
                if(entry.getValue()==4)
               {
                       f=1;
                       k=entry.getKey();
                       break;

                        

               }
               else{
                f=0;
               }

            }
            if(f==1)
            {
                System.out.println(k);

            }

    
        

    }
}