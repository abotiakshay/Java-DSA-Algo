import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class graphlinkedlist{




    static LinkedList<Integer> g[]=new LinkedList[4];
    
    public static void main(String[] args) {
        
        for(int i=0;i<g.length;i++)
        {
            g[i]=new LinkedList<Integer>();
        }

        addedge(0,2);
        addedge(0,2);
        addedge(0,2);
     

       boolean visited[]=new boolean[g.length];
     dfs(0,visited);


    }

    static void dfs(int s,boolean []visited)
    {
       
        visited[s]=true;
        System.out.println(s);

        Iterator<Integer> ii=g[s].iterator();

        while(ii.hasNext())
        {
            int k=ii.next();
            if(!(visited[k]))
            {
                dfs(k,visited);
            }
        }


    }


    static void bfs()
    {

        boolean visited[]=new boolean[g.length];
        Queue<Integer> q=new ArrayDeque<Integer>();
        q.add(0);
        visited[0]=true;
        

        while(!(q.isEmpty()))

          {  int t=q.poll();

            System.out.println(t);
            Iterator<Integer> ii=g[t].iterator();

            while(ii.hasNext())
            {
             int   index=ii.next();
                if(!(visited[index]))
                {

                    q.add(index);
                    visited[index]=true;
                }

                
                
            }}



        

    }

    static void print()
    {
        for(int i=0;i<g.length;i++)
        {
            Iterator k=g[i].iterator();

            System.out.print(i+"->");
            while(k.hasNext())
            {
                System.out.print(k.next() + ",");

                
            }
            System.out.println();
        }
    }

    static void addedge(int s,int d)
    {
        g[s].add(d);

        g[d].add(s);
    }
}