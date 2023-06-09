public class spiralpattern {
    public static void main(String[] args) {
        
        int m=4;
        int n=4;
        int mf=4;
        int nf=4;
        int i1=0;
        int i2=m-1;
        int  j1=0;
        int j2=n-1;
        char arr[][]={{' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' '}};
        int j=0;
        char p='0';
        int k=0;
      
        
while(k<arr.length)
{

        if(p=='X')
        {
            p='0';
        }
        else{
            p='X';
        }
        

        j=j1;
        for(;j<n;j++)
        {
            arr[i1][j]= p;
        }
        j=j1;
        for(;j<n;j++)
        {
            arr[i2][j]= p;
          
        }
        j=j1;
        for(;j<m;j++)
        {
            arr[j][j1]=p;
        }
        j=j1;
        for(;j<m;j++)
        {  
            arr[j][j2]=p;
            
        }
        j=j1;
        

        i1++;
        i2--;
        j1++;
        j2--;
        m--;
        n--;
       
        k+=2;
}

for (int i = 0; i < mf; i++) {
    for (int l= 0; l < nf; l++) {
        
        if(arr[i][j]==' ')
        {
            System.out.print(" ");

        }
        System.out.print(arr[i][l]+" ");
        
    }
    System.out.println();
}


    }
}
