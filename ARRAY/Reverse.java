public class Reverse{
    public static void main(String[] args) {
        int []a={1,2,3};
        int j=0;
        int i=a.length-1;
        for(;j<a.length/2;i--,j++)
        {

            int temp=a[j];
            a[j]=a[i];
            a[i]=temp;
          
        }
       
for(int k=0;k<a.length;k++)
{
    System.out.println(a[k]);
}

    }}
