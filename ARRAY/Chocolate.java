import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
public class Chocolate {
    public static void main(String[] args) {
        int a[]={12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m=7;

        Arrays.sort(a);
        int i=0;
        int dif=0,min=a[a.length-1]-a[0];
        while(i<a.length-m+1)
        {   
            dif=a[m+i-1]-a[i];
            if(dif<min)
            {
                min=dif;
            }
            i++;

        }
        System.out.println(min);
    }
}
