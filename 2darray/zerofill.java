import java.util.ArrayList;
import java.util.Arrays;

public class zerofill {
    public static void main(String[] args) {
        int arr[][]={{3,7,2,8,2},{2,2,4,1,8},{0,5,7,6,3},{8,1,0,7,7},{1,3,7,4,1},{6,5,5,6,3},{7,1,0,1,9},{5,4,4,9,7},{2,2,4,1,0},{7,1,1,9,1},{8,0,4,7,6},{7,5,1,2,3},{7,2,5,9,3}};


        ArrayList<String> s=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==0)
                {
                    s.add(i+":"+j);
                }

            }
        }

        System.out.println(s.toString());
       for(int i=0;i<s.size();i++)
       {

        String temp=s.get(i);
        String data[]=temp.split(":");
        int row=Integer.valueOf(data[0]);
        int column=Integer.valueOf(data[1]);
        
            for(int j1=0;j1<arr.length;j1++){
                arr[j1][column]=0;
                

            }
            for(int j1=0;j1<arr[row].length;j1++){
                arr[row][j1]=0;

           }
            

       }
       
       for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j]);
        }
        System.out.println();
       }
      


    }
}
