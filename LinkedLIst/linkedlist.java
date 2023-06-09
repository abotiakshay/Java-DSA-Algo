import java.lang.annotation.Inherited;

class Node{
    Node next;
    int data;

    Node(int data)
    {
        this.data=data;

    }
}



 class list{



    

    Node head;

     void insertatlast(int data)
    {

        Node newnode=new Node(data);

        if(head==null){
            head=newnode;
        }
        else{
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
     void display()
    {
        Node temp=head;

        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        
    }

    void reverse()
    {

        Node temp=head;
        Node prev=head;
       
       Node rev=null;

        while(temp!=null)
        {

            prev=temp;
            temp=temp.next;
            prev.next=rev;
            rev=prev;

        }
        head=prev;
        System.out.println(head.next.data);

       
            
         

        
    }


    void reverse2(Node a){

        Node temp=a;
        if(temp==null)
        {
            return;
        }

        reverse2(temp.next);
        System.out.println(temp.data);
    }

    void deleteatposition(int pos)
    {
        Node temp=head;
        Node prev=head;
        int counter=1;
        while(temp!=null)
        {

            if(counter==1)
            { 
                head=temp.next;
            }
            if(counter==pos)
            {

                prev.next=temp.next;
            }

            prev=temp;

            temp=temp.next;
            counter++;
            
        }
    }
    
}



public class linkedlist{

   

    public static void main(String[] args) {       
       
        list ls=new list();

       

        ls.insertatlast(20);
        ls.insertatlast(40);
        ls.insertatlast(30);
        ls.insertatlast(10);

       ls.display();


       System.out.println("After reverse");

       ls.reverse();
       ls.display();
      
       




    }
}