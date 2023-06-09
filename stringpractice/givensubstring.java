import java.util.*;

public class givensubstring {
    public static void main(String[] args) {
        String str="timetopractice";
        String sub="toc";
        List<String> arr=new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {

            for(int j=i+2;j<str.length();j++)
            {
                String innerstr=str.substring(i, j+1);
                int f=0;
                for (int j2 = 0; j2 < sub.length(); j2++) {

                    int k=innerstr.indexOf(sub.charAt(j2));
                    
                    if( k!=-1)
                    {
                        f=1;

                    }
                    else{
                        f=0;
                        break;
                    }
                }
                if(f==1)
                {
                    arr.add(innerstr);  
                    break;     
                }
               
                
            }


            
        }

      System.out.println(arr.toString());

   

      if(arr.get(arr.size()-1).length() == arr.get(arr.size()-2).length())
      {
        return arr.get(arr.size()-1);
      }
      else{
        return arr.get(arr.size()-1);
      }

    }
}
