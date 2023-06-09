import javax.swing.plaf.TableHeaderUI;

public class recursion{
    public static void main(String[] args)
    {

        int a[]={2,3,4,5,6,7,8};
        int n=7;
     Boolean ans=print(a,0,n-1,4);

     if(ans)
     {
        System.out.println("Found");
     }
     else{
        System.out.println("No found");
     }
       
      
    }

   static boolean print(int a[],int l,int h,int key)
    {
      
        
        if(l<=h)
        {
            
        int mid=(l+h)/2;

        if(key==a[mid])
        {
            return true;
        }


        else if(key< a[mid])
        {
              print(a,l,mid-1,key);

        }
       

       

        }
      
        return false;
       
        
        

       
       

       
         


            
    }
}