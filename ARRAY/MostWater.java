public class MostWater{
    public static void main(String[] args) {
        

        int a[]={1,1};

        int left=0;
        int right=a.length-1,h=a[0],max=0,water=0;
        while(left<right)
        {
             h=Math.min(a[left],a[right]);

             water=h*(right-left);

             max=Math.max(max,water);

            if(a[left]<a[right])
            {
                if(a[left]<a[left+1])
                left++;
                else{
                    left++;
                }
               
            }
            else{
                if(a[right]<a[right-1])
                right--;
                else{
                    right--;
                }
               
            }


           


        }
        System.out.println(max);
    }
}