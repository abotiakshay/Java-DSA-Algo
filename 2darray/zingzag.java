public class zingzag{
    public static void main(String args[])
    {
        int arr[][]={
            { 1, 2, 3, 4 },     
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },  
            { 13, 14, 15, 16 },
            { 17, 18, 19, 20 },
        };



        for(int i=0;i<arr.length;i++)
        {
            for(int j=0,k=i;j<=i;j++,k--)
            {

                System.out.print(arr[k][j]);



            }
            System.out.println();
        }
     

        for(int i=arr.length-1;i>0;i--)
        {

           
            for(int j=0,k=arr.length-1,con=arr.length-i;j<i;j++,k--,con++)
            {

                
                System.out.print(arr[k][con]);



            }
            
        }


         
        



    }
}