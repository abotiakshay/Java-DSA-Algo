import java.security.AllPermission;

public class SubArray{
    public static void main(String[] args) {
        int a[]={-2,1,-3,4,-1,2,1,-5,4};

        int max=a[0];
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
sum=a[i];
            for(int j=i+1;j<a.length;j++)
            {
                    sum=sum+a[j];
                    if(sum>max)
                    {
                        max=sum;
                    }
                
            }
        }
        System.out.println(Math.max(sum,sum1));

    }
}