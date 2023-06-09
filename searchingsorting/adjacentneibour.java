import java.util.*;
public class adjacentneibour {
    public static void main(String[] args) {
        int arr[]={5,5,10,100,10,5};
        int n=arr.length;
        Arrays.sort(arr);
        int sum=0;
        for(int i=n-1;i>=0;i-=2)
        {
            sum=sum+arr[i];
           
        }
        
        
       System.out.println(sum);

    }
}
