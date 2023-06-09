import java.util.*;


class check<Integer> implements Comparable {


@Override
public int compareTo(Object o) {
    


    return 0;
}

}
public class KthSmallest {
    public static void main(String[] args) {
        
        PriorityQueue<check> p=new PriorityQueue<check>();
       
        p.add(6);
        p.add(5);
        p.add(2);
        p.add(9);

        Iterator e=p.iterator();
        while(e.hasNext())
        {
            System.out.println(e.next());
        }
        

    }
}
