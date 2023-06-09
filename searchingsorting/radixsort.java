import java.util.Arrays;

public class radixsort {
    public static void main(String[] args) {
        int arr[]={120,754,334,2,248,50,1,9};

        radixsort(arr,arr.length);

        System.out.println(Arrays.toString(arr));



    }

    static void radixsort(int arr[],int n)
    {
        int max=Arrays.stream(arr).max().getAsInt();


        for(int i=1; max/i > 0; i *= 10)
        {

            countsort(arr,i,n);
            
        }



    }
    static void countsort(int arr[],int i,int n)
    {
        int count[]= new int[10];
        int output[]=new int[n];

        Arrays.fill(count, 0);
        for (int j = 0; j < n; j++) {
            count[(arr[j]/i)%10]++;
        }

        for (int j = 1; j < count.length; j++) {
            count[j] += count[j-1];
        }

        for (int j = n-1; j >=0; j--) {
            output[count[(arr[j]/i)%10]-1]=arr[j];
        
            count[(arr[j]/i)%10]--;
        }

        for (int j = 0; j < n; j++) {
            arr[j]=output[j];
        }


    }
}
