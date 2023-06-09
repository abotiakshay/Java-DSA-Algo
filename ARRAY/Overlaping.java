import java.util.*;
public class Overlaping {
    public static void main(String[] args) {
        

            int a[][]={{6,8},{1,9},{2,4},{4,7}};

                List l=new ArrayList<>();
            for(int i=0;i<a.length-1;i++)
            {
               
                if(  (a[i][a[i].length-1] < a[i+1][a[i].length-1])  ||  (a[i+1][a[i].length-1] < a[i][a[i].length-1]) )
                {
                     int  min= Math.min(a[i][0],a[i+1][0]);
                     int max=Math.max(a[i][a[i].length-1],a[i+1][a[i].length-1]);

                     System.out.println(min + " "+ max);
                     

                     a[i+1][0]=min;
                     a[i+1][a[i].length-1]=max;

                }


            }

    }
}
