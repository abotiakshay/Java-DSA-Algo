public class checkduplicate {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,2,4,1,8,3};

        for (int i = 0; i < a.length; i++) {
            a[a[i]%a.length]=a[a[i]%a.length]+a.length;
        }
        for (int i = 0; i < a.length; i++) {

                System.out.println(a[i]+"  ");

            
           
        }
    }
}

