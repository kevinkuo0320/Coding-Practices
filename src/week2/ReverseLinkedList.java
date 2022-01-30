public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {

        //use three pointers to rotate the linkedlist O(n) time

        if(head == null) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;

        while(next != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next ;
        }
        curr.next = prev;
        return curr;

    }
}

 class ListNode {
      int val;
      ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
