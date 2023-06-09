//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;


// } Driver Code Ends


//User function Template for Java

public class large {
    static void printLargest(String[] a) {

        
        // code here
        int  max=Integer.parseInt(a[0]);
        
        try{
        for(int i=0;i<a.length-1;i++)
        {
            int x=Integer.parseInt(max.toString() + a[i+1]);
            int y=Integer.parseInt(a[i+1] + String.valueOf(max));
            max= Math.max(x,y);
            System.out.println(max);
            
             
        }
    }
    catch(NumberFormatException n){}
        
       System.out.println(max);
        
    }


    public static void main(String[] args) {
        String []a={"250","74","559","931","273","545","879","924"};
        printLargest(a);
    }
}