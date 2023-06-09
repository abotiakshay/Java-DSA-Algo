import java.util.ArrayList;

public class findcommon {
    public static void main(String[] args) {
       int  ar1[] = {3,3,3 } ; 
int ar2[] = {3,3,3} ; 
int ar3[] = {3,3,3}  ;

    ArrayList<Integer> arr=new ArrayList<>();
    ArrayList<Integer> arr2=new ArrayList<>();
    int j=0;

        for (int i = 0; i < ar1.length; i++) {
            
         
        
           while(j<ar2.length && ar2[j]<=ar1[i] )
           {

                
               if(ar1[i]==ar2[j])
                    {
                        arr.add(ar1[i]);
                    }

                    if(j<ar2.length-1)
                    {
                      j++;
                    }
                    else{
                        break;
                    }

           }
        

        }
        j=0;

        for (int i = 0; i < arr.size(); i++) {
            
         
        
            while(ar3[j]<=arr.get(i) &&  j<ar3.length)
            {
 
                 
                if(ar3[j]==arr.get(i))
                     {
                        arr2.add(ar3[j]);
                     }

                    

                     if(j<ar3.length-1)
                     {
                       j++;
                     }
                     else{
                        break;
                     }
                
 
            }
 
         }




        System.out.println(arr2.toString());




    }
}
