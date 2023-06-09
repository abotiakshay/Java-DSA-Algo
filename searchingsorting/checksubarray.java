import java.util.*;
public class checksubarray {
    public static void main(String[] args) {
        int arr[]= { 1, 2, 4, 5, 3 };
        int sorted[]=arr.clone();
        Arrays.sort(sorted);
        ArrayList<Integer> sub=new ArrayList<>();

        for (int i = 0; i < sorted.length; i++) {
            if(sorted[i]!=arr[i])
            {
                int j=i;
                while(arr[j]!=sorted[i])
                {
                    sub.add(arr[j]);
                    j++;
                }
                sub.add(arr[j]);


                int k=i;
                Collections.reverse(sub);
                int f=0;
                int n=sub.size()+k;
                for(int l=0;k<n;k++,l++)
                {

                    if(sorted[k]!=(int)sub.get(l))
                    {
                        f=1;
                        break;
                    }
                    


                }

                if(f==1)
                {
                    System.out.println("No");
                    break;
                }
                else{
                    System.out.println("Yes");
                    break;
                }

                



                
            }

        }

        
    }
    }

