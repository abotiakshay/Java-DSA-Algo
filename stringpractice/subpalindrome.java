import java.util.*;
class Sortbyroll implements Comparator<String>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(String a, String b)
    {
        return b.length()-a.length();
    }
}

public class subpalindrome {
    static  boolean isPalindrome(String s){
    
    
    int left=0;
    int right=s.length()-1;
    
    while(left<=right){
        if(s.charAt(left)==s.charAt(right))
        {
            left++;
            right--;
        }
        else{
            return false;
        }
    }
    
    return true;
    
    
    }
    public static void main(String[] args) {

        String str="aaaaaaaaaaaaaaaaaaaaaaaaaaa";
        ArrayList<String> arr=new ArrayList<>();
        
       

       for (int i = 0; i < str.length(); i++) {

        for (int j = i; j < str.length(); j++) {
            
            String s=str.substring(i,j+1);
            
            boolean p=isPalindrome(s);
            if(p)
            {
                
                
                arr.add(s);
             

            }

        }
        
       }
Collections.sort(arr,new Sortbyroll());


System.out.println(arr.size()+1000000007 )%1000000007;
  


        
    }
}
