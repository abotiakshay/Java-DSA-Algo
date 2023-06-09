public class arraypermutation{
 public static void main(String[] args) {
    

    int nums[]={1,2,3};



    solve(nums,0);


 }
 static void solve(int nums[],int l)
 {
   if(l==nums.length);
   {
    
    return;
   }
  

   else{ for(int j=l;j<nums.length;j++)
   {
    int temp;
    temp=nums[j];
    nums[j]=nums[l];
    nums[l]=temp;

    solve(nums,l+1);
    temp=nums[j];
    nums[j]=nums[l];
    nums[l]=temp;

   }}


 }



}