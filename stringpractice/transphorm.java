public class transphorm {
    public static void main(String[] args) {
        double startime=System.nanoTime();
        
        String str1="YUZKxQReJATCSD";
        String str2="SeCJQKZRTADUxY";
        StringBuffer s=new StringBuffer(str1);
        
        int len1=str1.length()-1;
        int len2=str2.length()-1;
        int count=0;
        int f=1;
        

        for(;len1>=0;len1--,len2--)
        {
        
        if(s.charAt(len1) != str2.charAt(len2) )
        {
          
            char fchar=s.charAt(len1);
            s.deleteCharAt(len1);
            s.insert(0,fchar);
            count++;
            len1++;
            len2++;
        }
        

        if(s.toString().equals(str2))
        {
            f=0;
            break;
        }
        else{
            f=1;

        }

        }

         double endtime=System.nanoTime();

        System.out.println((endtime-startime)/1000000000);
    }
}
