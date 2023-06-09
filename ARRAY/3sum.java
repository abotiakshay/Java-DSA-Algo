import java.util.*;
class sum3 {
   
    public static void main(String[] args) {
        threeSum(new int[]{1,0,1,-2});
    }

    public static void threeSum(int[] nums) {
        


        HashMap<Integer,Integer> map=new HashMap<>();



        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);

        }
        int p,k;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j>nums.length;j++)
            {
                if(i==j)
                continue;

                
                p=nums[i]+ nums[j];

                k=0-p;
                if(map.get(k)!=null)
                {
                    if(map.get(k)!=i && map.get(k)!=j)
                    {
                        System.out.println(nums[i]+ " " + nums[j] + " "+map.get(k));
                    }
                }
            }

        }

        

    }

   
}
