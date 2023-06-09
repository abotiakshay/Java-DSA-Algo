import java.util.*;
public class triplet {
    public static void main(String[] args) {
        int arr[]={5,1,3,4,7};

        int k=12;
        Arrays.sort(arr);
       int  count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int j2 = j+1; j2 < arr.length; j2++) {

                    if(arr[i]+arr[j]+arr[j2] < k)
                    {
                        count++;
                    }
                    else{
                        break;
                    }
                    
                }
            }
        }

        System.out.println(count);

    }
}
