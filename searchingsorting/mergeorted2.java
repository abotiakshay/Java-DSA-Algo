import java.lang.reflect.Array;
import java.util.Arrays;

public class mergeorted2 {

    
    public static void main(String[] args) {
        int arr1[]={1,3,5,7};
        int arr2[]={0,2,6,8,9};
        
        int i=0,j=0,k=arr1.length-1;

        while(i<k)
        {

            if(arr1[i]<arr2[j])
            {
                i++;
            }
            else{

                int temp=arr1[k];
                arr1[k]=arr2[j];
                arr2[j]=temp;

                    k--;
                    j++;
            }



        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
