public class LLDuplicatesRemove {
    /**
     * Definition for singly-linked list.
     *
     */

        public ListNode deleteDuplicates(ListNode head) {

            if(head == null) {
                return head;
            }
            ListNode temp = head;
            while(temp.next != null) {
                ListNode TempNext = temp.next;
                if(TempNext.val == temp.val){
                    temp.next = TempNext.next;
                } else {
                    temp = temp.next;
                }
            }
            return head;
        }

}
class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
