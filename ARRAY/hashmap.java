import java.util.*;

public class hashmap {
    public static void main(String[] args) {

        HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
        map.put(11, true);
        map.put(15, true);
        map.put(6, true);
        map.put(8, true);
        map.put(9, true);
        map.put(10, true);

        int a[] = { 11, 25, 6, 8, 9, 10 };

        int p, x = 34;

        for (int i = 0; i < a.length; i++) {
            p=x-a[i];

           if( map.get(p)!=null){
            System.out.println(a[i]+ " "+ p);
            return;

           }
        }

    }
}