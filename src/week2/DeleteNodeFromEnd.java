public class DeleteNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        //use slow and fast pointer to traverse the linkedlist
        //if fast pointer go n times faster than slow pointer
        //slow will be at nth pointer when fast pointer reaches the end

        if(head.next == null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        for(int i = 0; i < n ; i++){
            fast = fast.next;
        }

        //edge case when need to delete exact n as fast reach the end
        if(fast == null){
            return head.next;
        }

        while(fast.next != null && fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
