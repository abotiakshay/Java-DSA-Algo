import java.util.*;

public class lcp {


    public static void main(String[] args) {
        String strs[]={"flower","flow","flight"};


        if (strs == null || strs.length == 0)
        System.out.println("");
    
    Arrays.sort(strs);

    System.out.println(Arrays.toString(strs));
    String first = strs[0];
    String last = strs[strs.length - 1];
    int c = 0;
    while(c < first.length())
    {
        if (first.charAt(c) == last.charAt(c))
            c++;
        else
            break;
    }
    
    if(c==0)
    {
System.out.println("");
    }
    else{
        System.out.println(first.substring(0, c));
    }


    }
}
