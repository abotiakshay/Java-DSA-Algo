import java.util.Arrays;

public class mergetwosortedarray {
    public static void main(String[] args) {
        
        int arr1[]={1,3,4,7};
        int arr2[]={0,2,6,8,9 };
int i=0,j=0,k=0,l=0,data=0;
        int a[]=new int[arr1.length+arr2.length];


        while(i<arr1.length && j<arr2.length)
        {

            if(arr1[i]<arr2[j])
            {

                data=arr1[i];

                i++;

                
            }
            else{
                data=arr2[j];
                j++;
            }

           a[k]=data;
           k++;

        }


while(i<arr1.length)
{
    a[k]=arr1[i];
    i++;
    k++;
}
while(j<arr2.length)
{
    a[k]=arr2[j];
    j++;
    k++;
}

int m1;
       for ( m1 = 0; m1 < arr1.length; m1++) {

        arr1[m1]=a[m1];
        
       }

       for(int l1=0;l1<arr2.length;l1++,m1++)
       {
            arr2[l1]=a[m1];
       }
       
       

       System.out.println(Arrays.toString(arr1));
       System.out.println(Arrays.toString(arr2));
       

       
    }
}
