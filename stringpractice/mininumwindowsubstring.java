import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class mininumwindowsubstring {
    public static void main(String[] args) {
        String str="ADOBECODEBANC";
        String pattern="ABC";
        ArrayList<Character> hs=new ArrayList<>();

       

    
        
        int len2=pattern.length();
       int min=Integer.MAX_VALUE;
       String minstr="";

            for(int i=0;i<str.length();i++)
            {
                for(int j=i+len2;j<=str.length();j++)
                {
                    hs.removeAll(hs);
                  
                    for(int k=i;k<j;k++)
                    {
                        hs.add(str.charAt(k));
                    }
                   
                    int f=0;
                    for(int l=0;l<pattern.length();l++)
                    {
                       if(hs.contains(pattern.charAt(l)))
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
                        if(hs.size()<min)
                        {
                            min=hs.size();
                            minstr="";
                            
                             for(int ll=0;ll<hs.size();ll++)
                             {
                                    minstr=minstr+hs.get(ll);
                             }
                            
                            break;

                            
                        }
                    }
                   
                }
            }

            System.out.println(minstr);


    }

}
