public class DeleteNode {

     public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
      }

    public void deleteNode(ListNode node) {
        ListNode temp=node;
        ListNode temp2=temp;
        while(temp.next!=null)
        {
            temp.val=temp.next.val;
            temp2=temp;
            temp=temp.next;
        }
        temp2.next=null;
    }

}
