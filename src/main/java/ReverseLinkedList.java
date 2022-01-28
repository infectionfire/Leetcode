public class ReverseLinkedList {


      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previousElem = null;
        ListNode nextElem = null;

        while(current!=null){
            nextElem = current.next;
            current.next = previousElem;
            previousElem = current;
            current = nextElem;
        }
        return previousElem;
    }
}
