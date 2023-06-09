import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class RotatedArray {


    static boolean binarySearch(int nums[])
    {


       int low=0;
       int high=nums.length-1;
        int mid=(low+high)/2;
        int data=7;
   
        while(low<=high)
        {

            if(nums[mid]==data)
            return true;
        if(nums[low]<nums[mid])
        {

          

            
            if(data<=nums[mid] && data>=nums[low])
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        else{
            if(data>=nums[mid] && data<=nums[low])
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }



            mid=(low+high)/2;
        }
        return false;

 
    }

    public static void main(String[] args)  throws Exception{
        int nums[]={4,5,6,7,0,1,2,3};
       
      

      String s=(binarySearch(nums)==true) ? "found":" not found";
      System.out.println(s);
}

    

   
}
