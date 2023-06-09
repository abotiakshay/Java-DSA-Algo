public class floorceil {
    public static void main(String[] args) {
        
        int arr[]={2,5,10,18,20};
        int low=0;
        int high=arr.length-1;

        int mid;
        int x=19;
        int f=0;
        while(low<=high)
        {

            mid=(low+high)/2;
            if(arr[mid]==x)
            {
                f=1;
                break;
            }
            else if(x<arr[mid])
            {
                high=mid-1;

            }
            else{
                low=mid+1;

            }
        }


int floor;
int ceil;
        

    }
}
