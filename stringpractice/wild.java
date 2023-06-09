public class wild {
    public static void main(String[] args) {
        

        StringBuffer wild=new StringBuffer("ge?ks*");
        String pattern="geeksforgeeks";
        String sub="";
        for(int i=0;i<wild.length();i++)
        {

            sub="";

            if(wild.charAt(i)=='*' )
            {
                
                
                for(int j=i;j<pattern.length();j++)
                {
                    if(i!=wild.length()-1)
                {
                    if(pattern.charAt(j)==wild.charAt(i+1))
                    {
                        break;
                    }
                }
                    
                        sub=sub+pattern.charAt(j);
                    

                    
                }

                wild.deleteCharAt(i);
                wild.insert(i, sub);
             
            }
            if(wild.charAt(i)=='?')
            {

                sub=sub+pattern.charAt(i);
                wild.deleteCharAt(i);
                wild.insert(i, sub);
               

            }
            
          

        }
        System.out.println(wild.toString().equals(pattern));



    }
}
