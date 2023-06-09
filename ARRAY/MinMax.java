 public class MinMax{
    public static void main(String[] args){
        int a[]={3,55,8,12,2,18,19};

        int min=a[0],max=a[0];
        
        int i=1,j=a.length-1;
       int mid=a.length/2;
        


       int starttime=(int) System.currentTimeMillis();

        while(i<=mid)
            {
                if(a[i]<min)
                {
                    min=a[i];
                }
                else if(a[j]<min)
                {
                    min=a[j];
                }

                
              

                i++;
                j--;

            }
            System.out.println(min);

            int endtime=System.currentTimeMillis();

            System.out.println((endtime-starttime));


      


    }
 }