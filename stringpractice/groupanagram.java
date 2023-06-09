import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
// sort approach is osm and very easy 
public class groupanagram {


   static boolean checkanagra(String str1,String str2){
    
    HashMap<Character,Integer> map=new HashMap<>();

    if(str1.length()!=str2.length())
    {
        return false;
    }
    if(str1.equals(str2))
    {
        return true;
    }

    for (int i = 0; i < str1.length(); i++) {

        if(map.containsKey(str1.charAt(i)))
        {
            map.put(str1.charAt(i), map.get(str1.charAt(i))+1);
        }
        else{
            map.put(str1.charAt(i), 1);
        }

    
    }
int f=0;
    for (int i = 0; i < str2.length(); i++) {

        if(map.containsKey(str2.charAt(i)))
        {
            
            map.put(str2.charAt(i), map.get(str2.charAt(i))-1);
        }
        else{
            return false;
        }

    
    }

    for(int i:map.values())
    {
        if(i==0)
        {
            f=1;
            
        }
        else{
            f=0;
            return false;

        }
        
    }

    if(f==1)
    {
        return true;
    }
    else{
       return false;
    }


   }
    public static void main(String[] args) {
        

        
           

            String s[]={"",""};

            ArrayList<String> arr=new ArrayList<>();
            List<List<String>> ls=new ArrayList<List<String>>();
            
            
            for (int i = 0; i < s.length; i++) {
                arr.add(s[i]);
            }

            for (int i = 0; i < arr.size(); i++) {


                
                List<String> ll=new ArrayList<>();
                String str=arr.get(i);
                ll.add(str);

                for (int j = i+1; j < arr.size(); j++) {
                    
                    if(arr.get(j).equals(""))
                    {
                        ll.add(arr.get(j));
                       
                    }
                    
                   boolean l= checkanagra(str,arr.get(j));
                   if(l==true)
                   {
                  ll.add(arr.get(j));
                  arr.remove(j);
                  j--;
                   }
                  

                }
                ls.add(ll);
                
            }


            System.out.println(ls.toString());


        
    }


}
