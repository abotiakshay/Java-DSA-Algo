import java.util.Arrays;

public class imagerotate{
    public static void main(String[] args) {
        
        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};

        int arrclone[][]=new int[arr1.length][arr1.length];
       
      
        for (int i = 0; i < arrclone.length; i++) {
            for (int j = 0; j < arrclone.length; j++) {
                arrclone[i][j]=arr1[i][j];
            }
            System.out.println();
        }
        
        for (int i = arr1.length-1,k=0; i >=0; i--,k++) {
            for (int j = 0; j < arr1.length; j++) {

                arr1[j][i]=arrclone[k][j];
            }
           
        }

        for (int i = 0; i < arrclone.length; i++) {
            for (int j = 0; j < arrclone.length; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }

        
    }

}