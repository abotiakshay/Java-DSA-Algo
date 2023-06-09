

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String first="anagram" ;
        String second="nagaram";
        StringBuilder third=new StringBuilder("nagaram");

        HashMap<Character,Integer> map=new HashMap();

        for (int i = 0; i < first.length();i++) {
            if(map.containsKey(first.charAt(i)))
            {

               int k= map.get(first.charAt(i));
                    map.replace(first.charAt(i),++k );

            }
            else{
                map.put(first.charAt(i),1);
            }
        }

        for (int i = 0; i < second.length();i++) {
            if(map.containsKey(second.charAt(i)))
            {

               int k= map.get(second.charAt(i));
                    map.replace(second.charAt(i),--k );

            }
            else{
                return false;
            }
        }

        int f=0;
        for (int i = 0; i < map.size(); i++) {

            if(map.get(first.charAt(i))==0)
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
}




