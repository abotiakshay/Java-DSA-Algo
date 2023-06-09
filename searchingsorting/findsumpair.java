import java.util.*;
public class findsumpair {
    public static void main(String[] args) {
        int arr[]={90, 70, 20, 80, 50};
        int x=45;

        Arrays.sort(arr);

        int i=0;
        int j=1;
        int dif;
        while(i<j && j<arr.length)
        {
          dif=Math.abs(arr[i]-arr[j]); 
          if(dif==x)
          {
            System.out.println("found");
            break;
          } 
          else if(dif>x){
            i++;
          }
          else{
            j++;
          }

        }

        

        

    }
}
