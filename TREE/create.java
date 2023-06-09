public class create {

     static class Node{
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data=data;
        }

        
    }



    static void insert(Node root,int data)
    {

        Node new1=new Node(data);
        new1.left=null;
        new1.right=null;


        if(root==null)
        {
            return ;
        }

       if(data<root.data)
       {

        if(root.left==null)
        {
            root.left=new1;
        }
        else{
        
            insert(root.left,data);
        }
       }
       else{

        if(root.right==null)
        {
            root.right=new1;
        }
        else{
            insert(root.right,data);
        }

       }


        

    }


    static void inorder(Node root)
    {
        if(root==null)
        {
            return ;
        }
        else{
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }


    static int sum(Node root)
    {
        if(root==null)
        return 0;
        else{
            return root.data + sum(root.left) + sum(root.right);
        }
    }

    static Node mirror(Node root)
    {
         

       if(root==null)
       {
        return null;
       }

       Node newnode=new Node(root.data);
       newnode.left=mirror(root.left);
       newnode.right=mirror(root.right);
       return newnode;




    }

    static void reverse(Node root)
    {
        if(root==null)
        {
            return;
        }
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;

        reverse(root.left);
        reverse(root.right);
    }


    public static void main(String[] args) {
        
        
        Node root=new Node(5);

        root.left=new Node(3);
        root.right=new Node(6);
        root.right.left=null;
        root.right.right=null;
        root.left.left=new Node(2);
        root.left.left.left=null;
        root.left.left.left=null;
        root.left.right=new Node(4);
        root.left.right.left=null;
        root.left.right.right=null;

    

      
       

     Node copy=mirror(root);
    
     reverse(copy);
     inorder(root);
       
        
        



    }
}



