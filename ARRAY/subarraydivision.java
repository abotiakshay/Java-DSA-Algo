import java.util.ArrayList;
import java.util.Collections;


public class subarraydivision {
    public static void main(String[] args) {
        int a[]={-2, 2, -5, 12, -11, -1, 7};
        int k=3,max=a[0],sum;
        ArrayList<Integer> d=new ArrayList<>();
        for(int i=0;i<a.length-1;i++)
        {
            max=Math.max(max,a[i]);
            sum=a[i];
            for(int j=i+1;j<a.length;j++)
            {
                sum=sum+a[j];
                
                if(sum % k==0)
                {
                   max= Math.max(max,sum);
                }
            }


        }



        System.out.println(max);

        
    }
}
