/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */



 class Solution {
    public void reorderList(ListNode head) {
        
        ListNode next=head;
        ListNode prev=head;
        ListNode temp=head;
        ListNode temp2=head;
       
        ListNode rev=null;



        ListNode originalmain=new ListNode(0);
        ListNode original=originalmain;

        while(temp2!=null)
        {

           
            ListNode original2=new ListNode(temp2.val);
            original.next=original2;
            original=original2;
            temp2=temp2.next;
            
            
        }

       


        while(temp!=null)
        {

            next=temp.next;
            prev=temp;
            prev.next=rev;
            rev=temp;

            temp=next;




        }

boolean flag=true;
ListNode originaltraverse=originalmain.next;
ListNode p=prev;
head=prev;
int k=prev.val;
        while(prev!=null )
        {
            
           
            if(flag)
            {
                 k=prev.val;
                prev.val=originaltraverse.val;
                flag=false;
                
                  originaltraverse=originaltraverse.next;

            }
            else{
                prev.val=k;
                flag=true;
            }

                 prev=prev.next;
            
          
           
        }

while(head!=null)
{
    System.out.println(head.val);
    head=head.next;
}

        

       

       
        



      
        

       



    }
}