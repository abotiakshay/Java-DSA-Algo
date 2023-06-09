class create{



    static class Node{
        int v;
        Node next;
        Node()
        {
            this.next=null;
        }
        Node(int x)
        {
            this.v=x;
            this.next=null;
        }
       
    }


    public static void main(String[] args) {
        Node g[]=new Node[3];

        for(int i=0;i<3;i++)
        {
            g[i]=null;
        }


        addedge(g,0,1);
        addedge(g,0,2);
        addedge(g,1,2);

        print(g);
    }

    static void addedge(Node g[],int s,int d)
    {

        Node node=new Node(d);
    
        
        node.next=g[s];
        g[s]=node;

        node=new Node(s);
        node.next=g[d];
        g[d]=node;
        
        
    }



     static void print(Node g[])
     {

        for(int i=0;i<g.length;i++)
        {
            Node temp=g[i];
            System.out.print(i+"->");
            while(temp!=null)
            {
                System.out.print(temp.v + ",");

                temp=temp.next;
            }
            System.out.println();
            

        }

     }
}