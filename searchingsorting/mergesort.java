import java.util.Arrays;

public class mergesort {

    public static void main(String[] args) {
        int low=0,high=4;
        int a[]={2,4,1,3,5};
        int count=divide(a,low,high);

        System.out.println(Arrays.toString(a) );
        System.out.println(count);
        
    }

    static int conquer(int a[],int low,int high)
    {
        int mid=(low+high)/2;
     
        int count=0;
        int r[]=new int[(high-low)+1];


        int i=low,j=mid+1,p=0;
        while(i<=mid  && j<=high)
        {
            if(a[i]<=a[j])
            {
                r[p++]=a[i++];
               

            }
            else{
                r[p++]=a[j++];
                count += (mid-i);
               
            }
        }

        while(i<=mid)
        {
            r[p++]=a[i++];
           
        }

        while(j<=high)
        {
            r[p++]=a[j++];
            

        } 

        for(int i1=low,l=0;l<=high-low;i1++,l++)
        {
            a[i1]=r[l];
        }

return count;

    }

   static int divide(int a[],int low, int high)
    {
        int count=0;
        if(low<high)
        {
            
            int mid=(low+high)/2;
            count+=divide(a,low,mid);
            count +=divide(a,mid+1,high);
            count+=conquer(a,low,high);
        }

        return count;
    }
   
}
