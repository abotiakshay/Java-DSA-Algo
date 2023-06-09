import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class prefix{
     public static void main(String[] args) {
        

        String str="aaaa";
        ArrayList<String> arr=new ArrayList<>();

        for(int i=0;i<str.length()-1;i++)
        {
            String str1=str.substring(0, i+1);
            String str2=str.substring(str.length()-i-1,str.length() );
            
            if(str1.equals(str2))
            {
                arr.add(str1);
            }

            
        }

        Collections.sort(arr,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
               return o2.length()-o1.length();
            }
        });

        System.out.println(arr.get(0).length());

     }
}