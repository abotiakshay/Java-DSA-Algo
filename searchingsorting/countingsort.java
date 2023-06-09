public class countingsort {
    public static void main(String[] args) {

        int a[]={'e','b','c','a','z','b'};
        int range[]=new int[256];

        int count[]=new int[a.length];

        for(int i=0;i<a.length;i++)
        {
           ++range[a[i]];
        }

        for (int i = 1; i <range.length; i++) {
           range[i]+=range[i-1];
        }

        for(int i=0;i<a.length;i++)
        {
            count[range[a[i]]-1]=a[i];
            range[a[i]]--;
        }

        for (int i = 0; i < count.length; i++) {
            System.out.println((char)count[i]);
        }




       
    }
}
