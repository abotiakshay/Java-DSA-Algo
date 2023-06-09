
import java.util.*;


public class wordsearch {
    public static void main(String[] args) {
        char arr[][]={{'A','B','C','E'},{'S','K','C','S'},{'A','D','E','E'}};
        String w="ABCB";
        Stack<String> st=new Stack<>(); 
        char first=w.charAt(0);
        st.push(0+""+0);
        int k=1;
        boolean abc=true;
        String str="";
        int i=0;
        while(i<15)
        {
            

            String position=st.peek();
            
            int flag=-1;
            int rowi=Integer.parseInt(position.charAt(0)+"");
            int coli=Integer.parseInt(position.charAt(1)+"");
            System.out.println(st.peek());
            System.out.println(arr[rowi][coli]);

            if(w.charAt(k)==arr[rowi+1][coli])
            {
                rowi++;
                st.push(rowi+""+coli);
                System.out.println(st.peek());
                
                flag=0;
            }
            else{
            
              
            }
            if(w.charAt(k)==arr[rowi][coli+1])
            {
                coli++;
                st.push(rowi+""+coli);
                flag=1;
                
            }
            else{
             
            }

            if(flag==0 || flag==1)
            {

                k++;
            }
            
        i++;

            
        }
       



        
        













    }

}
