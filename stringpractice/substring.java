import java.util.HashMap;


import java.util.*;

public class substring {

    static ArrayList<String> arr=new ArrayList<>();

    static int findsubstring(int i,int j,String str)
    {
        String sub;

        if(i==j)
        {
            sub=str.charAt(i) +"";
        }
        else{
           sub= str.substring(i,j);
        }
        HashMap<Character,Integer> map=new HashMap<>();

        int f=0;
        for(int k=0;k<sub.length();k++)
        {
            
            if(map.containsKey(sub.charAt(k)))
            {
                f=0;
                return 1;
            }
            else{
                f=1;
                map.put(sub.charAt(k), 1);
            }

        }
    if(f==1)
    {
        arr.add(sub);    
        return 0;    

    }
    else{

    return 1;
    }



    }

    public static void main(String[] args) {
        

        String str="bbbbb";

        for(int i=0;i<str.length();i++)
        {
           for(int j=i;j<str.length();j++)
           {
               int flag= findsubstring(i,j,str);   
               if(flag==1)
               {
                    break;
               }
           }
        } int max=0;

        for (int i = 0; i < str.length(); i++) {
           max=Math.max(max,arr.get(i).length());
        }
        System.out.println(max);



    }
}
