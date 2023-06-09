import java.util.Arrays;

public class lcps{

    public static void main(String[] args) {
        
        String str="abab";
        int lcp[]=new int[str.length()];
        lcp[0]=0;
        int i=0;
        int j=1;
        while(j<str.length())
        {
            if(str.charAt(i)==str.charAt(j))
            {
                lcp[j]=lcp[j-1]+1;
                i++;
                j++;

            }
            else{

                lcp[j]=lcp[j-1];
                j++;

            }
        }
       return lcp[lcp.length-1];

    }
}